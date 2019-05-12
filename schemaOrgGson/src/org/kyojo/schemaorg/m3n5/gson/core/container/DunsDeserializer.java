package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DUNS;
import org.kyojo.schemaorg.m3n5.core.Container.Duns;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DunsDeserializer implements JsonDeserializer<Duns> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Duns deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DUNS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DUNS(), Duns.class, DUNS.class, fldMap);
	}

}