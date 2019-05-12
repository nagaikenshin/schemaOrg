package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.OFFERS_PRESCRIPTION_BY_MAIL;
import org.kyojo.schemaorg.m3n5.pending.Container.OffersPrescriptionByMail;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OffersPrescriptionByMailDeserializer implements JsonDeserializer<OffersPrescriptionByMail> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OffersPrescriptionByMail deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OFFERS_PRESCRIPTION_BY_MAIL(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OFFERS_PRESCRIPTION_BY_MAIL(), OffersPrescriptionByMail.class, OFFERS_PRESCRIPTION_BY_MAIL.class, fldMap);
	}

}
