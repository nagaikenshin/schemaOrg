package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CAMPING_PITCH;
import org.kyojo.schemaorg.m3n4.core.Clazz.CampingPitch;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CampingPitchDeserializer implements JsonDeserializer<CampingPitch> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CampingPitch deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CAMPING_PITCH(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CAMPING_PITCH(), CampingPitch.class, CAMPING_PITCH.class, fldMap);
	}

}
