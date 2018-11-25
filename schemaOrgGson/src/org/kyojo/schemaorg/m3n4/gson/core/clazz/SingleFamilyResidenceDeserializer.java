package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SINGLE_FAMILY_RESIDENCE;
import org.kyojo.schemaorg.m3n4.core.Clazz.SingleFamilyResidence;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SingleFamilyResidenceDeserializer implements JsonDeserializer<SingleFamilyResidence> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SingleFamilyResidence deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SINGLE_FAMILY_RESIDENCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SINGLE_FAMILY_RESIDENCE(), SingleFamilyResidence.class, SINGLE_FAMILY_RESIDENCE.class, fldMap);
	}

}
