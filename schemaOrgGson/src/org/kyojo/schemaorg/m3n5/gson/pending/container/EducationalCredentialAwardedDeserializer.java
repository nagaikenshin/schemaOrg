package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.EDUCATIONAL_CREDENTIAL_AWARDED;
import org.kyojo.schemaorg.m3n5.pending.Container.EducationalCredentialAwarded;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EducationalCredentialAwardedDeserializer implements JsonDeserializer<EducationalCredentialAwarded> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EducationalCredentialAwarded deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EDUCATIONAL_CREDENTIAL_AWARDED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EDUCATIONAL_CREDENTIAL_AWARDED(), EducationalCredentialAwarded.class, EDUCATIONAL_CREDENTIAL_AWARDED.class, fldMap);
	}

}
