package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.AFFECTED_BY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.AffectedBy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AffectedByDeserializer implements JsonDeserializer<AffectedBy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AffectedBy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AFFECTED_BY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AFFECTED_BY(), AffectedBy.class, AFFECTED_BY.class, fldMap);
	}

}
