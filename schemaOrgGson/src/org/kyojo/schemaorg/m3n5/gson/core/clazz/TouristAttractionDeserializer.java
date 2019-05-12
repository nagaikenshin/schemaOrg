package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TOURIST_ATTRACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.TouristAttraction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TouristAttractionDeserializer implements JsonDeserializer<TouristAttraction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TouristAttraction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TOURIST_ATTRACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TOURIST_ATTRACTION(), TouristAttraction.class, TOURIST_ATTRACTION.class, fldMap);
	}

}
