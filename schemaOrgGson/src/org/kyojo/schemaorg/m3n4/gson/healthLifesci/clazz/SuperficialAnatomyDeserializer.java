package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.SUPERFICIAL_ANATOMY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.SuperficialAnatomy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SuperficialAnatomyDeserializer implements JsonDeserializer<SuperficialAnatomy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SuperficialAnatomy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUPERFICIAL_ANATOMY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUPERFICIAL_ANATOMY(), SuperficialAnatomy.class, SUPERFICIAL_ANATOMY.class, fldMap);
	}

}
