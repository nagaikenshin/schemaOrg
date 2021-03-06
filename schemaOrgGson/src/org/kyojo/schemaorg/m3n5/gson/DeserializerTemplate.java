package org.kyojo.schemaorg.m3n5.gson;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.kyojo.gson.JsonArray;
import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonObject;
import org.kyojo.gson.JsonParseException;
import org.kyojo.gson.reflect.TypeToken;
import org.kyojo.schemaorg.SimpleJsonBuilder;

public class DeserializerTemplate {

	public static <I, E extends I> I deserializeSub(JsonElement jsonElement, Type type,
			JsonDeserializationContext context, I obj, Class<I> ifc, Class<E> impl,
			Map<String, Field> fldMap) throws JsonParseException {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if(fldMap.size() == 0) {
			List<Field> dclFlds = SimpleJsonBuilder.getAllFields(impl);
			for(Field dclFld : dclFlds) {
				if(fldMap.containsKey(dclFld.getName())) {
					// 下位クラスのフィールドを優先
					continue;
				}
				fldMap.put(dclFld.getName(), dclFld);
			}
		}

		for(Entry<String, JsonElement> ent : jsonObject.entrySet()) {
			try {
				boolean noListSuf = fldMap.containsKey(ent.getKey());
				boolean hasListSuf = fldMap.containsKey(ent.getKey() + "List");
				if(noListSuf && !hasListSuf) {
					Field fld = fldMap.get(ent.getKey());
					JsonElement elm = ent.getValue();
					if(fld.getType().equals(List.class)) {
						ParameterizedType gType = (ParameterizedType)fld.getGenericType();
						Type[] aTypes = gType.getActualTypeArguments();
						Type listType = TypeToken.getParameterized(ArrayList.class, (Class<?>)aTypes[0]).getType();
						List<?> list = context.deserialize(elm, listType);
						fld.set(obj, list);
					} else {
						Object val = context.deserialize(elm, fld.getType());
						fld.set(obj, val);
					}
				} else if(hasListSuf) {
					Field fld = fldMap.get(ent.getKey() + "List");
					JsonElement elm = ent.getValue();
					ParameterizedType gType = (ParameterizedType)fld.getGenericType();
					Type[] aTypes = gType.getActualTypeArguments();
					Type listType = TypeToken.getParameterized(ArrayList.class, (Class<?>)aTypes[0]).getType();
					if(elm.isJsonArray()) {
						List<?> list = context.deserialize(elm, listType);
						fld.set(obj, list);
					} else {
						Object val = context.deserialize(elm, aTypes[0]);
						List<Object> list = context.deserialize(new JsonArray(), listType);
						list.add(val);
						fld.set(obj, list);
					}
				}
			} catch(IllegalArgumentException iae) {
				throw new JsonParseException(iae);
			} catch(IllegalAccessException iae) {
				throw new JsonParseException(iae);
			}
		}

		return obj;
	}

}
