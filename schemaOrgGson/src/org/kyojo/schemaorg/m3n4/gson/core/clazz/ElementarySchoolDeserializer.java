package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ELEMENTARY_SCHOOL;
import org.kyojo.schemaorg.m3n4.core.Clazz.ElementarySchool;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ElementarySchoolDeserializer implements JsonDeserializer<ElementarySchool> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ElementarySchool deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ELEMENTARY_SCHOOL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ELEMENTARY_SCHOOL(), ElementarySchool.class, ELEMENTARY_SCHOOL.class, fldMap);
	}

}
