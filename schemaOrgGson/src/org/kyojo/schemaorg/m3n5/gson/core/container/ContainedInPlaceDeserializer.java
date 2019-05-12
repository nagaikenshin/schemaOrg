package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CONTAINED_IN_PLACE;
import org.kyojo.schemaorg.m3n5.core.Container.ContainedInPlace;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ContainedInPlaceDeserializer implements JsonDeserializer<ContainedInPlace> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContainedInPlace deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTAINED_IN_PLACE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTAINED_IN_PLACE(), ContainedInPlace.class, CONTAINED_IN_PLACE.class, fldMap);
	}

}
