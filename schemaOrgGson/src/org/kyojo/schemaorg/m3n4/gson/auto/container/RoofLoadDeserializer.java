package org.kyojo.schemaorg.m3n4.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.auto.impl.ROOF_LOAD;
import org.kyojo.schemaorg.m3n4.auto.Container.RoofLoad;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RoofLoadDeserializer implements JsonDeserializer<RoofLoad> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RoofLoad deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ROOF_LOAD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ROOF_LOAD(), RoofLoad.class, ROOF_LOAD.class, fldMap);
	}

}
