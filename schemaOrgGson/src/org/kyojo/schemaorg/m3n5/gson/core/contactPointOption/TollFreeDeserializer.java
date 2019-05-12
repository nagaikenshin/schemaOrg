package org.kyojo.schemaorg.m3n5.gson.core.contactPointOption;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.contactPointOption.TOLL_FREE;
import org.kyojo.schemaorg.m3n5.core.ContactPointOption.TollFree;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TollFreeDeserializer implements JsonDeserializer<TollFree> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TollFree deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TOLL_FREE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TOLL_FREE(), TollFree.class, TOLL_FREE.class, fldMap);
	}

}
