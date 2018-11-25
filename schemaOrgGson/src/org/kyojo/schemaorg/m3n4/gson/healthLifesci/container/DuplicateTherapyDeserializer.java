package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DUPLICATE_THERAPY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DuplicateTherapy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DuplicateTherapyDeserializer implements JsonDeserializer<DuplicateTherapy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DuplicateTherapy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DUPLICATE_THERAPY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DUPLICATE_THERAPY(), DuplicateTherapy.class, DUPLICATE_THERAPY.class, fldMap);
	}

}
