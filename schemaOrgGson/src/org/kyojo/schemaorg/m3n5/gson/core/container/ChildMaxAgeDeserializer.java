package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CHILD_MAX_AGE;
import org.kyojo.schemaorg.m3n5.core.Container.ChildMaxAge;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ChildMaxAgeDeserializer implements JsonDeserializer<ChildMaxAge> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ChildMaxAge deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CHILD_MAX_AGE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CHILD_MAX_AGE(), ChildMaxAge.class, CHILD_MAX_AGE.class, fldMap);
	}

}
