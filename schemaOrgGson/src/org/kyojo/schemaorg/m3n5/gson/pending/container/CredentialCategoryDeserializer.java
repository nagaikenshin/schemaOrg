package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.CREDENTIAL_CATEGORY;
import org.kyojo.schemaorg.m3n5.pending.Container.CredentialCategory;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CredentialCategoryDeserializer implements JsonDeserializer<CredentialCategory> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CredentialCategory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CREDENTIAL_CATEGORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CREDENTIAL_CATEGORY(), CredentialCategory.class, CREDENTIAL_CATEGORY.class, fldMap);
	}

}
