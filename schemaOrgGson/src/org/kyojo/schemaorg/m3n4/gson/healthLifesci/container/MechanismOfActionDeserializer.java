package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MECHANISM_OF_ACTION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.MechanismOfAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MechanismOfActionDeserializer implements JsonDeserializer<MechanismOfAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MechanismOfAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MECHANISM_OF_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MECHANISM_OF_ACTION(), MechanismOfAction.class, MECHANISM_OF_ACTION.class, fldMap);
	}

}
