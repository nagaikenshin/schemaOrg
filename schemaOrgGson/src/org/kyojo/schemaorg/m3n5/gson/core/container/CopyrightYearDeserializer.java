package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COPYRIGHT_YEAR;
import org.kyojo.schemaorg.m3n5.core.Container.CopyrightYear;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CopyrightYearDeserializer implements JsonDeserializer<CopyrightYear> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CopyrightYear deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COPYRIGHT_YEAR(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COPYRIGHT_YEAR(), CopyrightYear.class, COPYRIGHT_YEAR.class, fldMap);
	}

}
