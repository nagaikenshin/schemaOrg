package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COMPOSER;
import org.kyojo.schemaorg.m3n5.core.Container.Composer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ComposerDeserializer implements JsonDeserializer<Composer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Composer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPOSER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPOSER(), Composer.class, COMPOSER.class, fldMap);
	}

}
