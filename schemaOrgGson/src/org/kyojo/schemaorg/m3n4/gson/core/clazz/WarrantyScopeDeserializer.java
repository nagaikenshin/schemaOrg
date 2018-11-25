package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.WARRANTY_SCOPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.WarrantyScope;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WarrantyScopeDeserializer implements JsonDeserializer<WarrantyScope> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WarrantyScope deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WARRANTY_SCOPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WARRANTY_SCOPE(), WarrantyScope.class, WARRANTY_SCOPE.class, fldMap);
	}

}
