package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.REGIONS_ALLOWED;
import org.kyojo.schemaorg.m3n4.core.Container.RegionsAllowed;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RegionsAllowedDeserializer implements JsonDeserializer<RegionsAllowed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RegionsAllowed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REGIONS_ALLOWED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REGIONS_ALLOWED(), RegionsAllowed.class, REGIONS_ALLOWED.class, fldMap);
	}

}
