package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.BED_TYPE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BedType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BedTypeDeserializer implements JsonDeserializer<BedType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BedType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BED_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BED_TYPE(), BedType.class, BED_TYPE.class, fldMap);
	}

}
