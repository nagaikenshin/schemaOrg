package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.QUALIFICATIONS;
import org.kyojo.schemaorg.m3n4.pending.Container.Qualifications;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class QualificationsDeserializer implements JsonDeserializer<Qualifications> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Qualifications deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new QUALIFICATIONS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new QUALIFICATIONS(), Qualifications.class, QUALIFICATIONS.class, fldMap);
	}

}
