package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.GRACE_PERIOD;
import org.kyojo.schemaorg.m3n4.pending.Container.GracePeriod;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GracePeriodDeserializer implements JsonDeserializer<GracePeriod> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GracePeriod deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GRACE_PERIOD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GRACE_PERIOD(), GracePeriod.class, GRACE_PERIOD.class, fldMap);
	}

}
