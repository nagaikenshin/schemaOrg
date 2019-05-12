package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.REPRESENTATIVE_OF_PAGE;
import org.kyojo.schemaorg.m3n5.core.Container.RepresentativeOfPage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RepresentativeOfPageDeserializer implements JsonDeserializer<RepresentativeOfPage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RepresentativeOfPage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REPRESENTATIVE_OF_PAGE(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REPRESENTATIVE_OF_PAGE(), RepresentativeOfPage.class, REPRESENTATIVE_OF_PAGE.class, fldMap);
	}

}
