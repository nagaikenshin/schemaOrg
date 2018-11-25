package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.APPEARANCE;
import org.kyojo.schemaorg.m3n4.pending.Container.Appearance;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AppearanceDeserializer implements JsonDeserializer<Appearance> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Appearance deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new APPEARANCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new APPEARANCE(), Appearance.class, APPEARANCE.class, fldMap);
	}

}
