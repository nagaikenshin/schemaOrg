package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_TRANSPOSES;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationTransposes;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LegislationTransposesDeserializer implements JsonDeserializer<LegislationTransposes> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegislationTransposes deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGISLATION_TRANSPOSES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGISLATION_TRANSPOSES(), LegislationTransposes.class, LEGISLATION_TRANSPOSES.class, fldMap);
	}

}
