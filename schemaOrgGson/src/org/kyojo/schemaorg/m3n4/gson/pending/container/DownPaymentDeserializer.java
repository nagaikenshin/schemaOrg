package org.kyojo.schemaorg.m3n4.gson.pending.container;

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
import org.kyojo.schemaorg.m3n4.pending.impl.DOWN_PAYMENT;
import org.kyojo.schemaorg.m3n4.pending.Container.DownPayment;

public class DownPaymentDeserializer implements JsonDeserializer<DownPayment> {

	@Override
	public DownPayment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DOWN_PAYMENT(jsonElement.getAsBigDecimal());
		}

		JsonObject jsonObject = jsonElement.getAsJsonObject();
		DownPayment obj = new DOWN_PAYMENT();
		HashMap<String, Field> fldMap = new HashMap<>();
		Field[] flds = DOWN_PAYMENT.class.getFields();
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
