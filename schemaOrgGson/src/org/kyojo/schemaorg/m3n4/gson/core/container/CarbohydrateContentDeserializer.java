package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CARBOHYDRATE_CONTENT;
import org.kyojo.schemaorg.m3n4.core.Container.CarbohydrateContent;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CarbohydrateContentDeserializer implements JsonDeserializer<CarbohydrateContent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CarbohydrateContent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CARBOHYDRATE_CONTENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CARBOHYDRATE_CONTENT(), CarbohydrateContent.class, CARBOHYDRATE_CONTENT.class, fldMap);
	}

}
