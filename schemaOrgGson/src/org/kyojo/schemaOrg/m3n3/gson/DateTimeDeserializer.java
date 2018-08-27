package org.kyojo.schemaorg.m3n3.gson;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;

public class DateTimeDeserializer implements JsonDeserializer<Date> {

	@Override
	public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals("")) {
			return null;
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
			return sdf.parse(jsonElement.getAsString());
		} catch(ParseException pe1) {
			sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
			try {
				return sdf.parse(jsonElement.getAsString());
			} catch(ParseException pe2) {
				sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				try {
					return sdf.parse(jsonElement.getAsString());
				} catch(ParseException pe3) {
					sdf = new SimpleDateFormat("yyyy-MM-dd");
					try {
						return sdf.parse(jsonElement.getAsString());
					} catch(ParseException pe4) {
						return null;
					}
				}
			}
		}
	}

}
