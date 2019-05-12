package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CONTACT_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.ContactType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ContactTypeDeserializer implements JsonDeserializer<ContactType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContactType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTACT_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTACT_TYPE(), ContactType.class, CONTACT_TYPE.class, fldMap);
	}

}
