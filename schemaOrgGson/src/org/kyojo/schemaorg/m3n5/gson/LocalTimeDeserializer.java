package org.kyojo.schemaorg.m3n5.gson;

import java.lang.reflect.Type;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;

public class LocalTimeDeserializer implements JsonDeserializer<LocalTime> {

	@Override
	public LocalTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals("")) {
			return null;
		}

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		try {
			return LocalTime.parse(jsonElement.getAsString(), dtf);
		} catch(DateTimeParseException dtpe1) {
			dtf = DateTimeFormatter.ofPattern("HH:mm");
			try {
				return LocalTime.parse(jsonElement.getAsString(), dtf);
			} catch(DateTimeParseException dtpe2) {
				return null;
			}
		}
	}

}
