package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PLACE_OF_WORSHIP;
import org.kyojo.schemaorg.m3n4.core.Clazz.PlaceOfWorship;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PlaceOfWorshipDeserializer implements JsonDeserializer<PlaceOfWorship> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PlaceOfWorship deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PLACE_OF_WORSHIP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PLACE_OF_WORSHIP(), PlaceOfWorship.class, PLACE_OF_WORSHIP.class, fldMap);
	}

}
