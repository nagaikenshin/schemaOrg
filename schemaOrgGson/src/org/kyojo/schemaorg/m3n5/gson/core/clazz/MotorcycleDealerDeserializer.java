package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MOTORCYCLE_DEALER;
import org.kyojo.schemaorg.m3n5.core.Clazz.MotorcycleDealer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MotorcycleDealerDeserializer implements JsonDeserializer<MotorcycleDealer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MotorcycleDealer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOTORCYCLE_DEALER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOTORCYCLE_DEALER(), MotorcycleDealer.class, MOTORCYCLE_DEALER.class, fldMap);
	}

}
