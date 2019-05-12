package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LODGING_UNIT_DESCRIPTION;
import org.kyojo.schemaorg.m3n5.core.Container.LodgingUnitDescription;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LodgingUnitDescriptionDeserializer implements JsonDeserializer<LodgingUnitDescription> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LodgingUnitDescription deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LODGING_UNIT_DESCRIPTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LODGING_UNIT_DESCRIPTION(), LodgingUnitDescription.class, LODGING_UNIT_DESCRIPTION.class, fldMap);
	}

}
