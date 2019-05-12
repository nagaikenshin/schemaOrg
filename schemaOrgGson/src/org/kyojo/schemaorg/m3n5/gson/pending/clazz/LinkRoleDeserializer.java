package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.LINK_ROLE;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LinkRole;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LinkRoleDeserializer implements JsonDeserializer<LinkRole> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LinkRole deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LINK_ROLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LINK_ROLE(), LinkRole.class, LINK_ROLE.class, fldMap);
	}

}
