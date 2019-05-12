package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.HOLDING_ARCHIVE;
import org.kyojo.schemaorg.m3n5.pending.Container.HoldingArchive;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HoldingArchiveDeserializer implements JsonDeserializer<HoldingArchive> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HoldingArchive deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOLDING_ARCHIVE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOLDING_ARCHIVE(), HoldingArchive.class, HOLDING_ARCHIVE.class, fldMap);
	}

}
