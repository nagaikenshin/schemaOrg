package org.kyojo.schemaorg.m3n4.gson.core.gameServerStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.gameServerStatus.OFFLINE_TEMPORARILY;
import org.kyojo.schemaorg.m3n4.core.GameServerStatus.OfflineTemporarily;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OfflineTemporarilyDeserializer implements JsonDeserializer<OfflineTemporarily> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OfflineTemporarily deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OFFLINE_TEMPORARILY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OFFLINE_TEMPORARILY(), OfflineTemporarily.class, OFFLINE_TEMPORARILY.class, fldMap);
	}

}
