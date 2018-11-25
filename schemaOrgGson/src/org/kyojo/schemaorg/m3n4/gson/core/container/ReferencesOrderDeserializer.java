package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.REFERENCES_ORDER;
import org.kyojo.schemaorg.m3n4.core.Container.ReferencesOrder;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReferencesOrderDeserializer implements JsonDeserializer<ReferencesOrder> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReferencesOrder deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REFERENCES_ORDER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REFERENCES_ORDER(), ReferencesOrder.class, REFERENCES_ORDER.class, fldMap);
	}

}
