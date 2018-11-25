package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HEADLINE;
import org.kyojo.schemaorg.m3n4.core.Container.Headline;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HeadlineDeserializer implements JsonDeserializer<Headline> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Headline deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEADLINE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEADLINE(), Headline.class, HEADLINE.class, fldMap);
	}

}
