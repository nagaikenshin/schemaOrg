package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.ARTERIAL_BRANCH;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ArterialBranch;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ArterialBranchDeserializer implements JsonDeserializer<ArterialBranch> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArterialBranch deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARTERIAL_BRANCH(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARTERIAL_BRANCH(), ArterialBranch.class, ARTERIAL_BRANCH.class, fldMap);
	}

}
