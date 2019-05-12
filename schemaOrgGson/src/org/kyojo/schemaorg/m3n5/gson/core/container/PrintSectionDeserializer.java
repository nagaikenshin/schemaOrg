package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PRINT_SECTION;
import org.kyojo.schemaorg.m3n5.core.Container.PrintSection;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PrintSectionDeserializer implements JsonDeserializer<PrintSection> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PrintSection deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRINT_SECTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRINT_SECTION(), PrintSection.class, PRINT_SECTION.class, fldMap);
	}

}
