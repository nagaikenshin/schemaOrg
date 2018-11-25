package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.EXPECTS_ACCEPTANCE_OF;
import org.kyojo.schemaorg.m3n4.pending.Container.ExpectsAcceptanceOf;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ExpectsAcceptanceOfDeserializer implements JsonDeserializer<ExpectsAcceptanceOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExpectsAcceptanceOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXPECTS_ACCEPTANCE_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXPECTS_ACCEPTANCE_OF(), ExpectsAcceptanceOf.class, EXPECTS_ACCEPTANCE_OF.class, fldMap);
	}

}
