package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.REPAYMENT_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.RepaymentSpecification;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RepaymentSpecificationDeserializer implements JsonDeserializer<RepaymentSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RepaymentSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REPAYMENT_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REPAYMENT_SPECIFICATION(), RepaymentSpecification.class, REPAYMENT_SPECIFICATION.class, fldMap);
	}

}
