package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PRINT_EDITION;
import org.kyojo.schemaorg.m3n5.core.Container.PrintEdition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PrintEditionDeserializer implements JsonDeserializer<PrintEdition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PrintEdition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRINT_EDITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRINT_EDITION(), PrintEdition.class, PRINT_EDITION.class, fldMap);
	}

}