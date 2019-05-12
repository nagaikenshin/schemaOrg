package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EXHIBITION_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.ExhibitionEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ExhibitionEventDeserializer implements JsonDeserializer<ExhibitionEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExhibitionEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXHIBITION_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXHIBITION_EVENT(), ExhibitionEvent.class, EXHIBITION_EVENT.class, fldMap);
	}

}
