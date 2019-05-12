package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CHILD_MIN_AGE;
import org.kyojo.schemaorg.m3n5.core.Container.ChildMinAge;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ChildMinAgeDeserializer implements JsonDeserializer<ChildMinAge> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ChildMinAge deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CHILD_MIN_AGE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CHILD_MIN_AGE(), ChildMinAge.class, CHILD_MIN_AGE.class, fldMap);
	}

}
