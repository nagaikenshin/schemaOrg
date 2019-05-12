package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VOLUME_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.VolumeNumber;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VolumeNumberDeserializer implements JsonDeserializer<VolumeNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VolumeNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VOLUME_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VOLUME_NUMBER(), VolumeNumber.class, VOLUME_NUMBER.class, fldMap);
	}

}
