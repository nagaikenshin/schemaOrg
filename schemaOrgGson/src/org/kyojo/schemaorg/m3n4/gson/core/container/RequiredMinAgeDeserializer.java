package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.REQUIRED_MIN_AGE;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredMinAge;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RequiredMinAgeDeserializer implements JsonDeserializer<RequiredMinAge> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RequiredMinAge deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new REQUIRED_MIN_AGE(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REQUIRED_MIN_AGE(), RequiredMinAge.class, REQUIRED_MIN_AGE.class, fldMap);
	}

}
