package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FOLLOWS;
import org.kyojo.schemaorg.m3n5.core.Container.Follows;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FollowsDeserializer implements JsonDeserializer<Follows> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Follows deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FOLLOWS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FOLLOWS(), Follows.class, FOLLOWS.class, fldMap);
	}

}
