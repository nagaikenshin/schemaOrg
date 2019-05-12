package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MEMBER;
import org.kyojo.schemaorg.m3n5.core.Container.Member;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MemberDeserializer implements JsonDeserializer<Member> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Member deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEMBER(), Member.class, MEMBER.class, fldMap);
	}

}
