package org.kyojo.schemaorg.m3n5.gson.core.digitalDocumentPermissionType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.digitalDocumentPermissionType.COMMENT_PERMISSION;
import org.kyojo.schemaorg.m3n5.core.DigitalDocumentPermissionType.CommentPermission;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CommentPermissionDeserializer implements JsonDeserializer<CommentPermission> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CommentPermission deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMMENT_PERMISSION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMMENT_PERMISSION(), CommentPermission.class, COMMENT_PERMISSION.class, fldMap);
	}

}
