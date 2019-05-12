package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PROGRAM_MEMBERSHIP;
import org.kyojo.schemaorg.m3n5.core.Clazz.ProgramMembership;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ProgramMembershipDeserializer implements JsonDeserializer<ProgramMembership> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProgramMembership deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROGRAM_MEMBERSHIP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROGRAM_MEMBERSHIP(), ProgramMembership.class, PROGRAM_MEMBERSHIP.class, fldMap);
	}

}
