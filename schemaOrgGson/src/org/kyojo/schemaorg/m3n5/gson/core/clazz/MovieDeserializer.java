package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MOVIE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Movie;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MovieDeserializer implements JsonDeserializer<Movie> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Movie deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOVIE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOVIE(), Movie.class, MOVIE.class, fldMap);
	}

}
