package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MEETING_ROOM;
import org.kyojo.schemaorg.m3n5.core.Clazz.MeetingRoom;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MeetingRoomDeserializer implements JsonDeserializer<MeetingRoom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MeetingRoom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEETING_ROOM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEETING_ROOM(), MeetingRoom.class, MEETING_ROOM.class, fldMap);
	}

}
