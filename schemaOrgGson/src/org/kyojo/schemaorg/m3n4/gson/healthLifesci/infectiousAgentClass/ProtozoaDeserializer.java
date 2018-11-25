package org.kyojo.schemaorg.m3n4.gson.healthLifesci.infectiousAgentClass;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.infectiousAgentClass.PROTOZOA;
import org.kyojo.schemaorg.m3n4.healthLifesci.InfectiousAgentClass.Protozoa;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ProtozoaDeserializer implements JsonDeserializer<Protozoa> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Protozoa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROTOZOA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROTOZOA(), Protozoa.class, PROTOZOA.class, fldMap);
	}

}
