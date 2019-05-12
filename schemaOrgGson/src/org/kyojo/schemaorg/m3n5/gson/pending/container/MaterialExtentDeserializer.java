package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.MATERIAL_EXTENT;
import org.kyojo.schemaorg.m3n5.pending.Container.MaterialExtent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MaterialExtentDeserializer implements JsonDeserializer<MaterialExtent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MaterialExtent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MATERIAL_EXTENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MATERIAL_EXTENT(), MaterialExtent.class, MATERIAL_EXTENT.class, fldMap);
	}

}
