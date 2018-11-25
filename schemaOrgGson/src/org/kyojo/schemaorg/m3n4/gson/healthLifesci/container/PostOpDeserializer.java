package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.POST_OP;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.PostOp;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PostOpDeserializer implements JsonDeserializer<PostOp> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PostOp deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new POST_OP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new POST_OP(), PostOp.class, POST_OP.class, fldMap);
	}

}
