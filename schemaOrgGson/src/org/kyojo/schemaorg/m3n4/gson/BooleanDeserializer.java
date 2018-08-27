package org.kyojo.schemaorg.m3n4.gson;

import java.lang.reflect.Type;
import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;

public class BooleanDeserializer implements JsonDeserializer<Boolean> {

	@Override
	public Boolean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals("") || jsonElement.getAsString().equals("0")
				|| jsonElement.getAsString().equals("false") || jsonElement.getAsString().equals("FALSE")) {
			return false;
		}

		return true;
	}

}
