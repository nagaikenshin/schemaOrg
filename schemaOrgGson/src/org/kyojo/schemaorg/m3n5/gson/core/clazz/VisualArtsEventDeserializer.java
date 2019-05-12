package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VISUAL_ARTS_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.VisualArtsEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VisualArtsEventDeserializer implements JsonDeserializer<VisualArtsEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VisualArtsEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VISUAL_ARTS_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VISUAL_ARTS_EVENT(), VisualArtsEvent.class, VISUAL_ARTS_EVENT.class, fldMap);
	}

}
