package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.VEIN;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Vein;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class VeinDeserializer implements JsonDeserializer<Vein> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Vein deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEIN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEIN(), Vein.class, VEIN.class, fldMap);
	}

}
