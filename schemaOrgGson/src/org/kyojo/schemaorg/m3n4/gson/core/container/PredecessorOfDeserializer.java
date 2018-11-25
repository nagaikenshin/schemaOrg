package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PREDECESSOR_OF;
import org.kyojo.schemaorg.m3n4.core.Container.PredecessorOf;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PredecessorOfDeserializer implements JsonDeserializer<PredecessorOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PredecessorOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PREDECESSOR_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PREDECESSOR_OF(), PredecessorOf.class, PREDECESSOR_OF.class, fldMap);
	}

}
