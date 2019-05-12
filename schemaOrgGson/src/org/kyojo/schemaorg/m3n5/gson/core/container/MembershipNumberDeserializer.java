package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MEMBERSHIP_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.MembershipNumber;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MembershipNumberDeserializer implements JsonDeserializer<MembershipNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MembershipNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEMBERSHIP_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEMBERSHIP_NUMBER(), MembershipNumber.class, MEMBERSHIP_NUMBER.class, fldMap);
	}

}