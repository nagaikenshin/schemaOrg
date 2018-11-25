package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.DOMICILED_MORTGAGE;
import org.kyojo.schemaorg.m3n4.pending.Container.DomiciledMortgage;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DomiciledMortgageDeserializer implements JsonDeserializer<DomiciledMortgage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DomiciledMortgage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DOMICILED_MORTGAGE(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DOMICILED_MORTGAGE(), DomiciledMortgage.class, DOMICILED_MORTGAGE.class, fldMap);
	}

}
