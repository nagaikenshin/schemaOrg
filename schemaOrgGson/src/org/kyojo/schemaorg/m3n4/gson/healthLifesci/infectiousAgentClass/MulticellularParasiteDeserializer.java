package org.kyojo.schemaorg.m3n4.gson.healthLifesci.infectiousAgentClass;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.infectiousAgentClass.MULTICELLULAR_PARASITE;
import org.kyojo.schemaorg.m3n4.healthLifesci.InfectiousAgentClass.MulticellularParasite;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MulticellularParasiteDeserializer implements JsonDeserializer<MulticellularParasite> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MulticellularParasite deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MULTICELLULAR_PARASITE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MULTICELLULAR_PARASITE(), MulticellularParasite.class, MULTICELLULAR_PARASITE.class, fldMap);
	}

}
