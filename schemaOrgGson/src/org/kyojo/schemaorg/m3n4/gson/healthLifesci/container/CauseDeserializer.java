package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.CAUSE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Cause;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CauseDeserializer implements JsonDeserializer<Cause> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Cause deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CAUSE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CAUSE(), Cause.class, CAUSE.class, fldMap);
	}

}
