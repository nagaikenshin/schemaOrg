package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.BODY_TYPE;
import org.kyojo.schemaorg.m3n5.auto.Container.BodyType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BodyTypeDeserializer implements JsonDeserializer<BodyType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BodyType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BODY_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BODY_TYPE(), BodyType.class, BODY_TYPE.class, fldMap);
	}

}
