package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.RADIATION_THERAPY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.RadiationTherapy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RadiationTherapyDeserializer implements JsonDeserializer<RadiationTherapy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RadiationTherapy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RADIATION_THERAPY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RADIATION_THERAPY(), RadiationTherapy.class, RADIATION_THERAPY.class, fldMap);
	}

}
