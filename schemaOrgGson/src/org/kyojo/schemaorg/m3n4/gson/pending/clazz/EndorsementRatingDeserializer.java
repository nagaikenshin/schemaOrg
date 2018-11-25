package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.ENDORSEMENT_RATING;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EndorsementRating;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EndorsementRatingDeserializer implements JsonDeserializer<EndorsementRating> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EndorsementRating deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ENDORSEMENT_RATING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ENDORSEMENT_RATING(), EndorsementRating.class, ENDORSEMENT_RATING.class, fldMap);
	}

}
