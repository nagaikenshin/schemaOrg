package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.IMAGING_TECHNIQUE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.ImagingTechnique;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ImagingTechniqueDeserializer implements JsonDeserializer<ImagingTechnique> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ImagingTechnique deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IMAGING_TECHNIQUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IMAGING_TECHNIQUE(), ImagingTechnique.class, IMAGING_TECHNIQUE.class, fldMap);
	}

}
