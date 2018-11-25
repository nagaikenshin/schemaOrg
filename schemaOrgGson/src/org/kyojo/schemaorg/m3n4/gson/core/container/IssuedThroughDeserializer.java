package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ISSUED_THROUGH;
import org.kyojo.schemaorg.m3n4.core.Container.IssuedThrough;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IssuedThroughDeserializer implements JsonDeserializer<IssuedThrough> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IssuedThrough deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ISSUED_THROUGH(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ISSUED_THROUGH(), IssuedThrough.class, ISSUED_THROUGH.class, fldMap);
	}

}
