package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MUSIC_COMPOSITION_FORM;
import org.kyojo.schemaorg.m3n4.core.Container.MusicCompositionForm;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MusicCompositionFormDeserializer implements JsonDeserializer<MusicCompositionForm> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MusicCompositionForm deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MUSIC_COMPOSITION_FORM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MUSIC_COMPOSITION_FORM(), MusicCompositionForm.class, MUSIC_COMPOSITION_FORM.class, fldMap);
	}

}
