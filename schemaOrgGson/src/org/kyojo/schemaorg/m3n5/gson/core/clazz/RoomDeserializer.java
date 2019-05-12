package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ROOM;
import org.kyojo.schemaorg.m3n5.core.Clazz.Room;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RoomDeserializer implements JsonDeserializer<Room> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Room deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ROOM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ROOM(), Room.class, ROOM.class, fldMap);
	}

}
