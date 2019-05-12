package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PROPERTY_ID;
import org.kyojo.schemaorg.m3n5.core.Container.PropertyID;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PropertyIDDeserializer implements JsonDeserializer<PropertyID> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PropertyID deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROPERTY_ID(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROPERTY_ID(), PropertyID.class, PROPERTY_ID.class, fldMap);
	}

}
