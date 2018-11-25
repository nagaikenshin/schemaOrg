package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PHYSICAL_ACTIVITY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalActivity;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PhysicalActivityDeserializer implements JsonDeserializer<PhysicalActivity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PhysicalActivity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PHYSICAL_ACTIVITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PHYSICAL_ACTIVITY(), PhysicalActivity.class, PHYSICAL_ACTIVITY.class, fldMap);
	}

}
