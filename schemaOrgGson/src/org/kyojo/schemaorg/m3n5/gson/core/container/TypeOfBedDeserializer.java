package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TYPE_OF_BED;
import org.kyojo.schemaorg.m3n5.core.Container.TypeOfBed;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TypeOfBedDeserializer implements JsonDeserializer<TypeOfBed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TypeOfBed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TYPE_OF_BED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TYPE_OF_BED(), TypeOfBed.class, TYPE_OF_BED.class, fldMap);
	}

}
