package org.kyojo.schemaorg.m3n4.gson.healthLifesci.physicalExam;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.THROAT;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.Throat;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ThroatDeserializer implements JsonDeserializer<Throat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Throat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new THROAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new THROAT(), Throat.class, THROAT.class, fldMap);
	}

}
