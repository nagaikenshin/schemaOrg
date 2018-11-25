package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MATERIAL;
import org.kyojo.schemaorg.m3n4.core.Container.Material;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MaterialDeserializer implements JsonDeserializer<Material> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Material deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MATERIAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MATERIAL(), Material.class, MATERIAL.class, fldMap);
	}

}
