package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PRE_OP;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PreOp;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PreOpDeserializer implements JsonDeserializer<PreOp> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PreOp deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRE_OP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRE_OP(), PreOp.class, PRE_OP.class, fldMap);
	}

}
