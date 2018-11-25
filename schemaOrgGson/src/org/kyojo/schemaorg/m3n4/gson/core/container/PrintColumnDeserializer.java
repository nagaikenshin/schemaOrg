package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PRINT_COLUMN;
import org.kyojo.schemaorg.m3n4.core.Container.PrintColumn;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PrintColumnDeserializer implements JsonDeserializer<PrintColumn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PrintColumn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRINT_COLUMN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRINT_COLUMN(), PrintColumn.class, PRINT_COLUMN.class, fldMap);
	}

}
