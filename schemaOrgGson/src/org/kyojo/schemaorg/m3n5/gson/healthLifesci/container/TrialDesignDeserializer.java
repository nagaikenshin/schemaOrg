package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.TRIAL_DESIGN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.TrialDesign;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TrialDesignDeserializer implements JsonDeserializer<TrialDesign> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TrialDesign deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRIAL_DESIGN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRIAL_DESIGN(), TrialDesign.class, TRIAL_DESIGN.class, fldMap);
	}

}
