package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PROPRIETARY_NAME;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.ProprietaryName;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ProprietaryNameDeserializer implements JsonDeserializer<ProprietaryName> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProprietaryName deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROPRIETARY_NAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROPRIETARY_NAME(), ProprietaryName.class, PROPRIETARY_NAME.class, fldMap);
	}

}
