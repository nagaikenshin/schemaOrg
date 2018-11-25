package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CARGO_VOLUME;
import org.kyojo.schemaorg.m3n4.core.Container.CargoVolume;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CargoVolumeDeserializer implements JsonDeserializer<CargoVolume> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CargoVolume deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CARGO_VOLUME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CARGO_VOLUME(), CargoVolume.class, CARGO_VOLUME.class, fldMap);
	}

}
