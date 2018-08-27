package org.kyojo.schemaorg.m3n4.gson;

import java.lang.reflect.Type;
import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;

public class TimeDeserializer implements JsonDeserializer<java.sql.Time> {

	@Override
	public java.sql.Time deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals("")) {
			return null;
		}

		try {
			return java.sql.Time.valueOf(jsonElement.getAsString());
		} catch(IllegalArgumentException iae) {
			return null;
		}
	}

}
