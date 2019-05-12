package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ASSEMBLY_VERSION;
import org.kyojo.schemaorg.m3n5.core.Container.AssemblyVersion;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AssemblyVersionDeserializer implements JsonDeserializer<AssemblyVersion> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AssemblyVersion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ASSEMBLY_VERSION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ASSEMBLY_VERSION(), AssemblyVersion.class, ASSEMBLY_VERSION.class, fldMap);
	}

}
