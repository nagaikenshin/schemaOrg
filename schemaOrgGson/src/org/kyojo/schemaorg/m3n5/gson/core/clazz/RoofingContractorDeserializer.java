package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ROOFING_CONTRACTOR;
import org.kyojo.schemaorg.m3n5.core.Clazz.RoofingContractor;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RoofingContractorDeserializer implements JsonDeserializer<RoofingContractor> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RoofingContractor deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ROOFING_CONTRACTOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ROOFING_CONTRACTOR(), RoofingContractor.class, ROOFING_CONTRACTOR.class, fldMap);
	}

}
