package org.kyojo.schemaorg.m3n4.gson.bib.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.bib.impl.COLLECTION;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Collection;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CollectionDeserializer implements JsonDeserializer<Collection> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Collection deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COLLECTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COLLECTION(), Collection.class, COLLECTION.class, fldMap);
	}

}
