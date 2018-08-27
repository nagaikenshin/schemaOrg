package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalImagingTechnique;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonObject;
import org.kyojo.gson.JsonParseException;
import org.kyojo.gson.reflect.TypeToken;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalImagingTechnique.RADIOGRAPHY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalImagingTechnique.Radiography;

public class RadiographyDeserializer implements JsonDeserializer<Radiography> {

	@Override
	public Radiography deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RADIOGRAPHY(jsonElement.getAsString());
		}

		JsonObject jsonObject = jsonElement.getAsJsonObject();
		Radiography obj = new RADIOGRAPHY();
		HashMap<String, Field> fldMap = new HashMap<>();
		Field[] flds = RADIOGRAPHY.class.getFields();
		for(Field fld : flds) {
			fldMap.put(fld.getName(), fld);
		}
		for(Entry<String, JsonElement> ent : jsonObject.entrySet()) {
			if(fldMap.containsKey(ent.getKey())) {
				Field fld = fldMap.get(ent.getKey());
				JsonElement elm = ent.getValue();
				try {
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
				} catch(IllegalArgumentException iae) {
					throw new JsonParseException(iae);
				} catch(IllegalAccessException iae) {
					throw new JsonParseException(iae);
				}
			}
		}

		return obj;
	}

}
