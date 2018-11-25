package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TYPE_AND_QUANTITY_NODE;
import org.kyojo.schemaorg.m3n4.core.Clazz.TypeAndQuantityNode;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TypeAndQuantityNodeDeserializer implements JsonDeserializer<TypeAndQuantityNode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TypeAndQuantityNode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TYPE_AND_QUANTITY_NODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TYPE_AND_QUANTITY_NODE(), TypeAndQuantityNode.class, TYPE_AND_QUANTITY_NODE.class, fldMap);
	}

}
