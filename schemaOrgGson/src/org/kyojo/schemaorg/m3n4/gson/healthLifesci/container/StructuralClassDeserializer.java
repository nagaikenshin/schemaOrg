package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STRUCTURAL_CLASS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.StructuralClass;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class StructuralClassDeserializer implements JsonDeserializer<StructuralClass> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StructuralClass deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STRUCTURAL_CLASS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STRUCTURAL_CLASS(), StructuralClass.class, STRUCTURAL_CLASS.class, fldMap);
	}

}
