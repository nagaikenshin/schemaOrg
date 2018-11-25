package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.SD_LICENSE;
import org.kyojo.schemaorg.m3n4.pending.Container.SdLicense;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SdLicenseDeserializer implements JsonDeserializer<SdLicense> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SdLicense deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SD_LICENSE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SD_LICENSE(), SdLicense.class, SD_LICENSE.class, fldMap);
	}

}
