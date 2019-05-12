package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DISTINGUISHING_SIGN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.DistinguishingSign;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DistinguishingSignDeserializer implements JsonDeserializer<DistinguishingSign> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DistinguishingSign deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DISTINGUISHING_SIGN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DISTINGUISHING_SIGN(), DistinguishingSign.class, DISTINGUISHING_SIGN.class, fldMap);
	}

}
