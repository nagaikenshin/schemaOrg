package org.kyojo.schemaorg.m3n4.gson.healthLifesci.physicalActivityCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.physicalActivityCategory.ANAEROBIC_ACTIVITY;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalActivityCategory.AnaerobicActivity;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AnaerobicActivityDeserializer implements JsonDeserializer<AnaerobicActivity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AnaerobicActivity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ANAEROBIC_ACTIVITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ANAEROBIC_ACTIVITY(), AnaerobicActivity.class, ANAEROBIC_ACTIVITY.class, fldMap);
	}

}
