package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.EPIDEMIOLOGY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Epidemiology;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EpidemiologyDeserializer implements JsonDeserializer<Epidemiology> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Epidemiology deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EPIDEMIOLOGY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EPIDEMIOLOGY(), Epidemiology.class, EPIDEMIOLOGY.class, fldMap);
	}

}
