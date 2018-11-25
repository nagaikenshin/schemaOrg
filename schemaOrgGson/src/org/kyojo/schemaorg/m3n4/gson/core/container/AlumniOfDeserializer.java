package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ALUMNI_OF;
import org.kyojo.schemaorg.m3n4.core.Container.AlumniOf;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AlumniOfDeserializer implements JsonDeserializer<AlumniOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AlumniOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ALUMNI_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ALUMNI_OF(), AlumniOf.class, ALUMNI_OF.class, fldMap);
	}

}
