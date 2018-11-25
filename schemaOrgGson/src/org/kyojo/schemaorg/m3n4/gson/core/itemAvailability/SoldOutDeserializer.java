package org.kyojo.schemaorg.m3n4.gson.core.itemAvailability;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.itemAvailability.SOLD_OUT;
import org.kyojo.schemaorg.m3n4.core.ItemAvailability.SoldOut;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SoldOutDeserializer implements JsonDeserializer<SoldOut> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SoldOut deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOLD_OUT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOLD_OUT(), SoldOut.class, SOLD_OUT.class, fldMap);
	}

}
