package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ASSOCIATED_PATHOPHYSIOLOGY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.AssociatedPathophysiology;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AssociatedPathophysiologyDeserializer implements JsonDeserializer<AssociatedPathophysiology> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AssociatedPathophysiology deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ASSOCIATED_PATHOPHYSIOLOGY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ASSOCIATED_PATHOPHYSIOLOGY(), AssociatedPathophysiology.class, ASSOCIATED_PATHOPHYSIOLOGY.class, fldMap);
	}

}
