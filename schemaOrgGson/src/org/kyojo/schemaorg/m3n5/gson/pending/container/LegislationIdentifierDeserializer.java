package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.LEGISLATION_IDENTIFIER;
import org.kyojo.schemaorg.m3n5.pending.Container.LegislationIdentifier;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LegislationIdentifierDeserializer implements JsonDeserializer<LegislationIdentifier> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegislationIdentifier deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGISLATION_IDENTIFIER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGISLATION_IDENTIFIER(), LegislationIdentifier.class, LEGISLATION_IDENTIFIER.class, fldMap);
	}

}