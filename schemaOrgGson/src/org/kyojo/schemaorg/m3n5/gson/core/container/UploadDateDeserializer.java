package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.UPLOAD_DATE;
import org.kyojo.schemaorg.m3n5.core.Container.UploadDate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UploadDateDeserializer implements JsonDeserializer<UploadDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UploadDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new UPLOAD_DATE(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new UPLOAD_DATE(), UploadDate.class, UPLOAD_DATE.class, fldMap);
	}

}
