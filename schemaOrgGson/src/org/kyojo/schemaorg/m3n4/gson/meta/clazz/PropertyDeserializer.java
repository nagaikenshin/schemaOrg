package org.kyojo.schemaorg.m3n4.gson.meta.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.meta.impl.PROPERTY;
import org.kyojo.schemaorg.m3n4.meta.Clazz.Property;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PropertyDeserializer implements JsonDeserializer<Property> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Property deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROPERTY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROPERTY(), Property.class, PROPERTY.class, fldMap);
	}

}
