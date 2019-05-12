package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GIVEN_NAME_RUBY;
import org.kyojo.schemaorg.m3n5.core.Container.GivenNameRuby;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GivenNameRubyDeserializer implements JsonDeserializer<GivenNameRuby> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GivenNameRuby deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GIVEN_NAME_RUBY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GIVEN_NAME_RUBY(), GivenNameRuby.class, GIVEN_NAME_RUBY.class, fldMap);
	}

}