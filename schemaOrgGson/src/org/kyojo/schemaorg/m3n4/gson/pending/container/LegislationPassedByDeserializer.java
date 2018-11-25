package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_PASSED_BY;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationPassedBy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LegislationPassedByDeserializer implements JsonDeserializer<LegislationPassedBy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegislationPassedBy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGISLATION_PASSED_BY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGISLATION_PASSED_BY(), LegislationPassedBy.class, LEGISLATION_PASSED_BY.class, fldMap);
	}

}
