package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ELIGIBLE_TRANSACTION_VOLUME;
import org.kyojo.schemaorg.m3n4.core.Container.EligibleTransactionVolume;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EligibleTransactionVolumeDeserializer implements JsonDeserializer<EligibleTransactionVolume> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EligibleTransactionVolume deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ELIGIBLE_TRANSACTION_VOLUME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ELIGIBLE_TRANSACTION_VOLUME(), EligibleTransactionVolume.class, ELIGIBLE_TRANSACTION_VOLUME.class, fldMap);
	}

}
