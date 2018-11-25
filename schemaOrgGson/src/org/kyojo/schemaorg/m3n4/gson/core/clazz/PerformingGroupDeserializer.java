package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PERFORMING_GROUP;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformingGroup;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PerformingGroupDeserializer implements JsonDeserializer<PerformingGroup> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PerformingGroup deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PERFORMING_GROUP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PERFORMING_GROUP(), PerformingGroup.class, PERFORMING_GROUP.class, fldMap);
	}

}
