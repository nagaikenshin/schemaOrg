package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FOLLOWEE;
import org.kyojo.schemaorg.m3n5.core.Container.Followee;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FolloweeDeserializer implements JsonDeserializer<Followee> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Followee deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FOLLOWEE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FOLLOWEE(), Followee.class, FOLLOWEE.class, fldMap);
	}

}
