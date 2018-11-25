package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ADMINISTRATIVE_AREA;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdministrativeArea;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AdministrativeAreaDeserializer implements JsonDeserializer<AdministrativeArea> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AdministrativeArea deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADMINISTRATIVE_AREA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADMINISTRATIVE_AREA(), AdministrativeArea.class, ADMINISTRATIVE_AREA.class, fldMap);
	}

}
