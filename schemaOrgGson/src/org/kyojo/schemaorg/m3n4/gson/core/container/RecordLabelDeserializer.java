package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.RECORD_LABEL;
import org.kyojo.schemaorg.m3n4.core.Container.RecordLabel;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RecordLabelDeserializer implements JsonDeserializer<RecordLabel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecordLabel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECORD_LABEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECORD_LABEL(), RecordLabel.class, RECORD_LABEL.class, fldMap);
	}

}
