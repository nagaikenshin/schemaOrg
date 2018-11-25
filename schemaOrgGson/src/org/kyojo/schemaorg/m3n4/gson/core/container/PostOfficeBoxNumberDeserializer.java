package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.POST_OFFICE_BOX_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.PostOfficeBoxNumber;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PostOfficeBoxNumberDeserializer implements JsonDeserializer<PostOfficeBoxNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PostOfficeBoxNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new POST_OFFICE_BOX_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new POST_OFFICE_BOX_NUMBER(), PostOfficeBoxNumber.class, POST_OFFICE_BOX_NUMBER.class, fldMap);
	}

}
