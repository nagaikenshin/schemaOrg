package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LANDLORD;
import org.kyojo.schemaorg.m3n5.core.Container.Landlord;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LandlordDeserializer implements JsonDeserializer<Landlord> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Landlord deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LANDLORD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LANDLORD(), Landlord.class, LANDLORD.class, fldMap);
	}

}