package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NAIL_SALON;
import org.kyojo.schemaorg.m3n5.core.Clazz.NailSalon;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NailSalonDeserializer implements JsonDeserializer<NailSalon> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NailSalon deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NAIL_SALON(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NAIL_SALON(), NailSalon.class, NAIL_SALON.class, fldMap);
	}

}
