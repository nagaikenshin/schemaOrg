package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.CONNECTED_TO;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.ConnectedTo;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ConnectedToDeserializer implements JsonDeserializer<ConnectedTo> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ConnectedTo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONNECTED_TO(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONNECTED_TO(), ConnectedTo.class, CONNECTED_TO.class, fldMap);
	}

}
