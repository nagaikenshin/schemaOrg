package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PART_OF_ORDER;
import org.kyojo.schemaorg.m3n4.core.Container.PartOfOrder;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PartOfOrderDeserializer implements JsonDeserializer<PartOfOrder> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PartOfOrder deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PART_OF_ORDER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PART_OF_ORDER(), PartOfOrder.class, PART_OF_ORDER.class, fldMap);
	}

}
