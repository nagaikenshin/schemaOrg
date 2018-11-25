package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.HOW_PERFORMED;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.HowPerformed;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HowPerformedDeserializer implements JsonDeserializer<HowPerformed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HowPerformed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOW_PERFORMED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOW_PERFORMED(), HowPerformed.class, HOW_PERFORMED.class, fldMap);
	}

}
