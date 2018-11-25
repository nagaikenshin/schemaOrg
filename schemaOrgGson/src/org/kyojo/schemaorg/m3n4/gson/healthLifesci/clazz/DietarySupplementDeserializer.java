package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DIETARY_SUPPLEMENT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DietarySupplement;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DietarySupplementDeserializer implements JsonDeserializer<DietarySupplement> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DietarySupplement deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIETARY_SUPPLEMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIETARY_SUPPLEMENT(), DietarySupplement.class, DIETARY_SUPPLEMENT.class, fldMap);
	}

}
