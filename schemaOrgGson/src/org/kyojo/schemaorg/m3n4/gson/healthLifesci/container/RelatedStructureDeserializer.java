package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.RELATED_STRUCTURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RelatedStructure;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RelatedStructureDeserializer implements JsonDeserializer<RelatedStructure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RelatedStructure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RELATED_STRUCTURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RELATED_STRUCTURE(), RelatedStructure.class, RELATED_STRUCTURE.class, fldMap);
	}

}
