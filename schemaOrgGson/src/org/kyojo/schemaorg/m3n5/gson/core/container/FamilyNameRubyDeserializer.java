package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FAMILY_NAME_RUBY;
import org.kyojo.schemaorg.m3n5.core.Container.FamilyNameRuby;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FamilyNameRubyDeserializer implements JsonDeserializer<FamilyNameRuby> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FamilyNameRuby deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FAMILY_NAME_RUBY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FAMILY_NAME_RUBY(), FamilyNameRuby.class, FAMILY_NAME_RUBY.class, fldMap);
	}

}