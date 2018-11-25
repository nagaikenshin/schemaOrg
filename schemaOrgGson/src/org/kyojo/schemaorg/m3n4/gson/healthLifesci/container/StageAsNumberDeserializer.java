package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STAGE_AS_NUMBER;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.StageAsNumber;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class StageAsNumberDeserializer implements JsonDeserializer<StageAsNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StageAsNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STAGE_AS_NUMBER(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STAGE_AS_NUMBER(), StageAsNumber.class, STAGE_AS_NUMBER.class, fldMap);
	}

}
