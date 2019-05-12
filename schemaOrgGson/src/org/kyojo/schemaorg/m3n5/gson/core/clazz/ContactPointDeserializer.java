package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CONTACT_POINT;
import org.kyojo.schemaorg.m3n5.core.Clazz.ContactPoint;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ContactPointDeserializer implements JsonDeserializer<ContactPoint> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContactPoint deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTACT_POINT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTACT_POINT(), ContactPoint.class, CONTACT_POINT.class, fldMap);
	}

}
