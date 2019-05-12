package org.kyojo.schemaorg.m3n5.gson.bib.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.READ_BY;
import org.kyojo.schemaorg.m3n5.bib.Container.ReadBy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReadByDeserializer implements JsonDeserializer<ReadBy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReadBy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new READ_BY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new READ_BY(), ReadBy.class, READ_BY.class, fldMap);
	}

}
