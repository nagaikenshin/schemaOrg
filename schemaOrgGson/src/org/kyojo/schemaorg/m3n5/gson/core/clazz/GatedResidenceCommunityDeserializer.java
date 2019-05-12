package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GATED_RESIDENCE_COMMUNITY;
import org.kyojo.schemaorg.m3n5.core.Clazz.GatedResidenceCommunity;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GatedResidenceCommunityDeserializer implements JsonDeserializer<GatedResidenceCommunity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GatedResidenceCommunity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GATED_RESIDENCE_COMMUNITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GATED_RESIDENCE_COMMUNITY(), GatedResidenceCommunity.class, GATED_RESIDENCE_COMMUNITY.class, fldMap);
	}

}
