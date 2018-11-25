package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.NATURAL_PROGRESSION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.NaturalProgression;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NaturalProgressionDeserializer implements JsonDeserializer<NaturalProgression> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NaturalProgression deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NATURAL_PROGRESSION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NATURAL_PROGRESSION(), NaturalProgression.class, NATURAL_PROGRESSION.class, fldMap);
	}

}
