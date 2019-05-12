package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.BREASTFEEDING_WARNING;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.BreastfeedingWarning;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BreastfeedingWarningDeserializer implements JsonDeserializer<BreastfeedingWarning> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BreastfeedingWarning deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BREASTFEEDING_WARNING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BREASTFEEDING_WARNING(), BreastfeedingWarning.class, BREASTFEEDING_WARNING.class, fldMap);
	}

}
