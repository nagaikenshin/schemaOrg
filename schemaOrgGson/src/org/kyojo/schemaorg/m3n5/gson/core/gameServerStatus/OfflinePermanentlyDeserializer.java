package org.kyojo.schemaorg.m3n5.gson.core.gameServerStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.gameServerStatus.OFFLINE_PERMANENTLY;
import org.kyojo.schemaorg.m3n5.core.GameServerStatus.OfflinePermanently;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OfflinePermanentlyDeserializer implements JsonDeserializer<OfflinePermanently> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OfflinePermanently deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OFFLINE_PERMANENTLY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OFFLINE_PERMANENTLY(), OfflinePermanently.class, OFFLINE_PERMANENTLY.class, fldMap);
	}

}
