package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.WORKERS_UNION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.WorkersUnion;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WorkersUnionDeserializer implements JsonDeserializer<WorkersUnion> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WorkersUnion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WORKERS_UNION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WORKERS_UNION(), WorkersUnion.class, WORKERS_UNION.class, fldMap);
	}

}
