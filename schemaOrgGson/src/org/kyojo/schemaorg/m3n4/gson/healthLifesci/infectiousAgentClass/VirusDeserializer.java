package org.kyojo.schemaorg.m3n4.gson.healthLifesci.infectiousAgentClass;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.infectiousAgentClass.VIRUS;
import org.kyojo.schemaorg.m3n4.healthLifesci.InfectiousAgentClass.Virus;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class VirusDeserializer implements JsonDeserializer<Virus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Virus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VIRUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VIRUS(), Virus.class, VIRUS.class, fldMap);
	}

}
