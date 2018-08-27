package org.kyojo.schemaorg.m3n3.gson;

import java.lang.reflect.Type;
import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;

public class DateDeserializer implements JsonDeserializer<java.sql.Date> {

	@Override
	public java.sql.Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals("")) {
			return null;
		}

		try {
			return java.sql.Date.valueOf(jsonElement.getAsString());
		} catch(IllegalArgumentException iae) {
			return null;
		}
	}

}
