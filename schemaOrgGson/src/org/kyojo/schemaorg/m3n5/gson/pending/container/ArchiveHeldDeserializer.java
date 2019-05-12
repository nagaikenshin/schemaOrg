package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.ARCHIVE_HELD;
import org.kyojo.schemaorg.m3n5.pending.Container.ArchiveHeld;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ArchiveHeldDeserializer implements JsonDeserializer<ArchiveHeld> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArchiveHeld deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARCHIVE_HELD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARCHIVE_HELD(), ArchiveHeld.class, ARCHIVE_HELD.class, fldMap);
	}

}
