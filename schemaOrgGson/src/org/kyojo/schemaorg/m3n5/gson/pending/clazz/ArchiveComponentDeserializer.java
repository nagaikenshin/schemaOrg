package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.ARCHIVE_COMPONENT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ArchiveComponent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ArchiveComponentDeserializer implements JsonDeserializer<ArchiveComponent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArchiveComponent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARCHIVE_COMPONENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARCHIVE_COMPONENT(), ArchiveComponent.class, ARCHIVE_COMPONENT.class, fldMap);
	}

}
