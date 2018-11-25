package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DEFENCE_ESTABLISHMENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.DefenceEstablishment;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DefenceEstablishmentDeserializer implements JsonDeserializer<DefenceEstablishment> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DefenceEstablishment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DEFENCE_ESTABLISHMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DEFENCE_ESTABLISHMENT(), DefenceEstablishment.class, DEFENCE_ESTABLISHMENT.class, fldMap);
	}

}
