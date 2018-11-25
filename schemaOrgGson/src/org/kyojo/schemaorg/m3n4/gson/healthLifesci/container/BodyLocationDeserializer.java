package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.BODY_LOCATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.BodyLocation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BodyLocationDeserializer implements JsonDeserializer<BodyLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BodyLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BODY_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BODY_LOCATION(), BodyLocation.class, BODY_LOCATION.class, fldMap);
	}

}
