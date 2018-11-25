package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.EXECUTABLE_LIBRARY_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.ExecutableLibraryName;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ExecutableLibraryNameDeserializer implements JsonDeserializer<ExecutableLibraryName> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExecutableLibraryName deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXECUTABLE_LIBRARY_NAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXECUTABLE_LIBRARY_NAME(), ExecutableLibraryName.class, EXECUTABLE_LIBRARY_NAME.class, fldMap);
	}

}
