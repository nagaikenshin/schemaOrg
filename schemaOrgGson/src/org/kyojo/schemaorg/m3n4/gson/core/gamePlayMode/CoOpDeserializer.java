package org.kyojo.schemaorg.m3n4.gson.core.gamePlayMode;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.gamePlayMode.CO_OP;
import org.kyojo.schemaorg.m3n4.core.GamePlayMode.CoOp;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CoOpDeserializer implements JsonDeserializer<CoOp> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CoOp deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CO_OP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CO_OP(), CoOp.class, CO_OP.class, fldMap);
	}

}
