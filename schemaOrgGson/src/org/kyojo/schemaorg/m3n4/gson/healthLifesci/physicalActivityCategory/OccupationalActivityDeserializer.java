package org.kyojo.schemaorg.m3n4.gson.healthLifesci.physicalActivityCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.physicalActivityCategory.OCCUPATIONAL_ACTIVITY;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalActivityCategory.OccupationalActivity;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OccupationalActivityDeserializer implements JsonDeserializer<OccupationalActivity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OccupationalActivity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OCCUPATIONAL_ACTIVITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OCCUPATIONAL_ACTIVITY(), OccupationalActivity.class, OCCUPATIONAL_ACTIVITY.class, fldMap);
	}

}
