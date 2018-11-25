package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.LOCATION_CREATED;
import org.kyojo.schemaorg.m3n4.core.Container.LocationCreated;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LocationCreatedDeserializer implements JsonDeserializer<LocationCreated> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LocationCreated deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOCATION_CREATED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOCATION_CREATED(), LocationCreated.class, LOCATION_CREATED.class, fldMap);
	}

}
