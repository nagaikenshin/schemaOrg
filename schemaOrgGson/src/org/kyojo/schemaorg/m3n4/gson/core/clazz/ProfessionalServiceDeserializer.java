package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PROFESSIONAL_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProfessionalService;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ProfessionalServiceDeserializer implements JsonDeserializer<ProfessionalService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProfessionalService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROFESSIONAL_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROFESSIONAL_SERVICE(), ProfessionalService.class, PROFESSIONAL_SERVICE.class, fldMap);
	}

}
