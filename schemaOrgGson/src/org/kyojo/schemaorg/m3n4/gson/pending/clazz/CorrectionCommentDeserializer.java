package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.CORRECTION_COMMENT;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CorrectionComment;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CorrectionCommentDeserializer implements JsonDeserializer<CorrectionComment> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CorrectionComment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CORRECTION_COMMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CORRECTION_COMMENT(), CorrectionComment.class, CORRECTION_COMMENT.class, fldMap);
	}

}
