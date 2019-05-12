package org.kyojo.schemaorg.m3n5.gson.healthLifesci.infectiousAgentClass;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.infectiousAgentClass.PRION;
import org.kyojo.schemaorg.m3n5.healthLifesci.InfectiousAgentClass.Prion;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PrionDeserializer implements JsonDeserializer<Prion> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Prion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRION(), Prion.class, PRION.class, fldMap);
	}

}
