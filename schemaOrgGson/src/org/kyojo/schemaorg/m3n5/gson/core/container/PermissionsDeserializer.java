package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PERMISSIONS;
import org.kyojo.schemaorg.m3n5.core.Container.Permissions;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PermissionsDeserializer implements JsonDeserializer<Permissions> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Permissions deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PERMISSIONS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PERMISSIONS(), Permissions.class, PERMISSIONS.class, fldMap);
	}

}