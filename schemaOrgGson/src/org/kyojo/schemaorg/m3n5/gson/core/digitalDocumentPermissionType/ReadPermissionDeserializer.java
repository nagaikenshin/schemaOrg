package org.kyojo.schemaorg.m3n5.gson.core.digitalDocumentPermissionType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.digitalDocumentPermissionType.READ_PERMISSION;
import org.kyojo.schemaorg.m3n5.core.DigitalDocumentPermissionType.ReadPermission;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReadPermissionDeserializer implements JsonDeserializer<ReadPermission> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReadPermission deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new READ_PERMISSION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new READ_PERMISSION(), ReadPermission.class, READ_PERMISSION.class, fldMap);
	}

}
