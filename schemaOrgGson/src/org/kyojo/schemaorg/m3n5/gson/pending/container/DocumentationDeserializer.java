package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.DOCUMENTATION;
import org.kyojo.schemaorg.m3n5.pending.Container.Documentation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DocumentationDeserializer implements JsonDeserializer<Documentation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Documentation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DOCUMENTATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DOCUMENTATION(), Documentation.class, DOCUMENTATION.class, fldMap);
	}

}
