package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.EDUCATIONAL_USE;
import org.kyojo.schemaorg.m3n4.core.Container.EducationalUse;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EducationalUseDeserializer implements JsonDeserializer<EducationalUse> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EducationalUse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EDUCATIONAL_USE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EDUCATIONAL_USE(), EducationalUse.class, EDUCATIONAL_USE.class, fldMap);
	}

}
