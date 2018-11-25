package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PUBLICATION_ISSUE;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationIssue;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PublicationIssueDeserializer implements JsonDeserializer<PublicationIssue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PublicationIssue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PUBLICATION_ISSUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PUBLICATION_ISSUE(), PublicationIssue.class, PUBLICATION_ISSUE.class, fldMap);
	}

}
