package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.RELATED_THERAPY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.RelatedTherapy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RelatedTherapyDeserializer implements JsonDeserializer<RelatedTherapy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RelatedTherapy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RELATED_THERAPY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RELATED_THERAPY(), RelatedTherapy.class, RELATED_THERAPY.class, fldMap);
	}

}
