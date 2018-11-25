package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.LIBRARY_SYSTEM;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LibrarySystem;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LibrarySystemDeserializer implements JsonDeserializer<LibrarySystem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LibrarySystem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LIBRARY_SYSTEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LIBRARY_SYSTEM(), LibrarySystem.class, LIBRARY_SYSTEM.class, fldMap);
	}

}
