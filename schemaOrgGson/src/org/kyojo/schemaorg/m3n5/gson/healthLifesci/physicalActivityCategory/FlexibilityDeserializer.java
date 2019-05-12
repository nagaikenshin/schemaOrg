package org.kyojo.schemaorg.m3n5.gson.healthLifesci.physicalActivityCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.physicalActivityCategory.FLEXIBILITY;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalActivityCategory.Flexibility;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FlexibilityDeserializer implements JsonDeserializer<Flexibility> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Flexibility deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FLEXIBILITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FLEXIBILITY(), Flexibility.class, FLEXIBILITY.class, fldMap);
	}

}
