package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.EDUCATIONAL_OCCUPATIONAL_CREDENTIAL;
import org.kyojo.schemaorg.m3n5.pending.Clazz.EducationalOccupationalCredential;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EducationalOccupationalCredentialDeserializer implements JsonDeserializer<EducationalOccupationalCredential> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EducationalOccupationalCredential deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EDUCATIONAL_OCCUPATIONAL_CREDENTIAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EDUCATIONAL_OCCUPATIONAL_CREDENTIAL(), EducationalOccupationalCredential.class, EDUCATIONAL_OCCUPATIONAL_CREDENTIAL.class, fldMap);
	}

}
