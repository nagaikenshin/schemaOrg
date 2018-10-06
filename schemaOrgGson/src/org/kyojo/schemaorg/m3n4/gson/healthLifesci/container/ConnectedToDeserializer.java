package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.kyojo.gson.JsonArray;
import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonObject;
import org.kyojo.gson.JsonParseException;
import org.kyojo.gson.reflect.TypeToken;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.CONNECTED_TO;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ConnectedTo;

public class ConnectedToDeserializer implements JsonDeserializer<ConnectedTo> {

	@Override
	public ConnectedTo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONNECTED_TO(jsonElement.getAsString());
		}

		JsonObject jsonObject = jsonElement.getAsJsonObject();
		ConnectedTo obj = new CONNECTED_TO();
		HashMap<String, Field> fldMap = new HashMap<>();
		Field[] flds = CONNECTED_TO.class.getFields();
		for(Field fld : flds) {
			fldMap.put(fld.getName(), fld);
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
