package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CHILDRENS_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.ChildrensEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ChildrensEventDeserializer implements JsonDeserializer<ChildrensEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ChildrensEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CHILDRENS_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CHILDRENS_EVENT(), ChildrensEvent.class, CHILDRENS_EVENT.class, fldMap);
	}

}
