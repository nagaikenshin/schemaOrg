package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.THREE_DIMENSIONAL_MODEL;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ThreeDimensionalModel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ThreeDimensionalModelDeserializer implements JsonDeserializer<ThreeDimensionalModel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ThreeDimensionalModel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new THREE_DIMENSIONAL_MODEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new THREE_DIMENSIONAL_MODEL(), ThreeDimensionalModel.class, THREE_DIMENSIONAL_MODEL.class, fldMap);
	}

}
