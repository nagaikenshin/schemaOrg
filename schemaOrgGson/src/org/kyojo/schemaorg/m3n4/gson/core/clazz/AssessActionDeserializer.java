package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ASSESS_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.AssessAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AssessActionDeserializer implements JsonDeserializer<AssessAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AssessAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ASSESS_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ASSESS_ACTION(), AssessAction.class, ASSESS_ACTION.class, fldMap);
	}

}
