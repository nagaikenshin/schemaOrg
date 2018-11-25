package org.kyojo.schemaorg.m3n4.gson.core.contactPointOption;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.contactPointOption.HEARING_IMPAIRED_SUPPORTED;
import org.kyojo.schemaorg.m3n4.core.ContactPointOption.HearingImpairedSupported;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HearingImpairedSupportedDeserializer implements JsonDeserializer<HearingImpairedSupported> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HearingImpairedSupported deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEARING_IMPAIRED_SUPPORTED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEARING_IMPAIRED_SUPPORTED(), HearingImpairedSupported.class, HEARING_IMPAIRED_SUPPORTED.class, fldMap);
	}

}
