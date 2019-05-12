package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CONTACT_POINT_OPTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ContactPointOption;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ContactPointOptionDeserializer implements JsonDeserializer<ContactPointOption> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContactPointOption deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTACT_POINT_OPTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTACT_POINT_OPTION(), ContactPointOption.class, CONTACT_POINT_OPTION.class, fldMap);
	}

}
