package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.TRANSMISSION_METHOD;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.TransmissionMethod;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TransmissionMethodDeserializer implements JsonDeserializer<TransmissionMethod> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TransmissionMethod deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRANSMISSION_METHOD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRANSMISSION_METHOD(), TransmissionMethod.class, TRANSMISSION_METHOD.class, fldMap);
	}

}
