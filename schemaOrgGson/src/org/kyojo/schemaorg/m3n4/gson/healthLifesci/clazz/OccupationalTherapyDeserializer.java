package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.OCCUPATIONAL_THERAPY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.OccupationalTherapy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OccupationalTherapyDeserializer implements JsonDeserializer<OccupationalTherapy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OccupationalTherapy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OCCUPATIONAL_THERAPY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OCCUPATIONAL_THERAPY(), OccupationalTherapy.class, OCCUPATIONAL_THERAPY.class, fldMap);
	}

}
