package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DDX_ELEMENT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DDxElement;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DDxElementDeserializer implements JsonDeserializer<DDxElement> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DDxElement deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DDX_ELEMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DDX_ELEMENT(), DDxElement.class, DDX_ELEMENT.class, fldMap);
	}

}
