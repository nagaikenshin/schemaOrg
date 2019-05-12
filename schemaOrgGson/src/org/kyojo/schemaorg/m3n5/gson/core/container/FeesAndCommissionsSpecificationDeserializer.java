package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FEES_AND_COMMISSIONS_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Container.FeesAndCommissionsSpecification;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FeesAndCommissionsSpecificationDeserializer implements JsonDeserializer<FeesAndCommissionsSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FeesAndCommissionsSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FEES_AND_COMMISSIONS_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FEES_AND_COMMISSIONS_SPECIFICATION(), FeesAndCommissionsSpecification.class, FEES_AND_COMMISSIONS_SPECIFICATION.class, fldMap);
	}

}
