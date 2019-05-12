package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RESERVATION_PACKAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ReservationPackage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReservationPackageDeserializer implements JsonDeserializer<ReservationPackage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReservationPackage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESERVATION_PACKAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESERVATION_PACKAGE(), ReservationPackage.class, RESERVATION_PACKAGE.class, fldMap);
	}

}
