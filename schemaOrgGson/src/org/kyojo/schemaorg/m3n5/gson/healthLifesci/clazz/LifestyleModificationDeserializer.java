package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.LIFESTYLE_MODIFICATION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.LifestyleModification;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LifestyleModificationDeserializer implements JsonDeserializer<LifestyleModification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LifestyleModification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LIFESTYLE_MODIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LIFESTYLE_MODIFICATION(), LifestyleModification.class, LIFESTYLE_MODIFICATION.class, fldMap);
	}

}
