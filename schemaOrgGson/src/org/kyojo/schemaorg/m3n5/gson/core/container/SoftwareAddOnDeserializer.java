package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SOFTWARE_ADD_ON;
import org.kyojo.schemaorg.m3n5.core.Container.SoftwareAddOn;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SoftwareAddOnDeserializer implements JsonDeserializer<SoftwareAddOn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SoftwareAddOn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOFTWARE_ADD_ON(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOFTWARE_ADD_ON(), SoftwareAddOn.class, SOFTWARE_ADD_ON.class, fldMap);
	}

}