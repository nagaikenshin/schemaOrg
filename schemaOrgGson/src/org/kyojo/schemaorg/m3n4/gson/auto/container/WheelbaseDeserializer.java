package org.kyojo.schemaorg.m3n4.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.auto.impl.WHEELBASE;
import org.kyojo.schemaorg.m3n4.auto.Container.Wheelbase;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WheelbaseDeserializer implements JsonDeserializer<Wheelbase> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Wheelbase deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WHEELBASE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WHEELBASE(), Wheelbase.class, WHEELBASE.class, fldMap);
	}

}
