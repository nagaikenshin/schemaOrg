package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BRANCH_CODE;
import org.kyojo.schemaorg.m3n4.core.Container.BranchCode;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BranchCodeDeserializer implements JsonDeserializer<BranchCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BranchCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BRANCH_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BRANCH_CODE(), BranchCode.class, BRANCH_CODE.class, fldMap);
	}

}
