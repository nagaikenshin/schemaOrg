package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PRIMARY_PREVENTION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.PrimaryPrevention;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PrimaryPreventionDeserializer implements JsonDeserializer<PrimaryPrevention> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PrimaryPrevention deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRIMARY_PREVENTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRIMARY_PREVENTION(), PrimaryPrevention.class, PRIMARY_PREVENTION.class, fldMap);
	}

}
