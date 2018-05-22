package org.kyojo.schemaOrg.m3n3.gson.core.driveWheelConfigurationValue;

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
import org.kyojo.schemaOrg.m3n3.core.driveWheelConfigurationValue.ALL_WHEEL_DRIVE_CONFIGURATION;
import org.kyojo.schemaOrg.m3n3.core.DriveWheelConfigurationValue.AllWheelDriveConfiguration;

public class AllWheelDriveConfigurationDeserializer implements JsonDeserializer<AllWheelDriveConfiguration> {

	@Override
	public AllWheelDriveConfiguration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ALL_WHEEL_DRIVE_CONFIGURATION(jsonElement.getAsString());
		}

		JsonObject jsonObject = jsonElement.getAsJsonObject();
		AllWheelDriveConfiguration obj = new ALL_WHEEL_DRIVE_CONFIGURATION();
		HashMap<String, Field> fldMap = new HashMap<>();
		Field[] flds = ALL_WHEEL_DRIVE_CONFIGURATION.class.getFields();
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
