package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.HAS_OCCUPATION;
import org.kyojo.schemaorg.m3n4.pending.Container.HasOccupation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HasOccupationDeserializer implements JsonDeserializer<HasOccupation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HasOccupation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HAS_OCCUPATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HAS_OCCUPATION(), HasOccupation.class, HAS_OCCUPATION.class, fldMap);
	}

}
