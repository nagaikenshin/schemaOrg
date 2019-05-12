package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MEMBER_OF;
import org.kyojo.schemaorg.m3n5.core.Container.MemberOf;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MemberOfDeserializer implements JsonDeserializer<MemberOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MemberOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEMBER_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEMBER_OF(), MemberOf.class, MEMBER_OF.class, fldMap);
	}

}
