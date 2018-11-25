package org.kyojo.schemaorg.m3n4.gson.healthLifesci.infectiousAgentClass;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.infectiousAgentClass.BACTERIA;
import org.kyojo.schemaorg.m3n4.healthLifesci.InfectiousAgentClass.Bacteria;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BacteriaDeserializer implements JsonDeserializer<Bacteria> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Bacteria deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BACTERIA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BACTERIA(), Bacteria.class, BACTERIA.class, fldMap);
	}

}
