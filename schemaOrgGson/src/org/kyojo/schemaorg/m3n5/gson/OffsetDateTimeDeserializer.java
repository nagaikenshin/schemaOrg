package org.kyojo.schemaorg.m3n5.gson;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;

public class OffsetDateTimeDeserializer implements JsonDeserializer<OffsetDateTime> {

	@Override
	public OffsetDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals("")) {
			return null;
		}

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
		try {
			return OffsetDateTime.parse(jsonElement.getAsString(), dtf);
		} catch(DateTimeParseException dtpe1) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			try {
				Date date = sdf.parse(jsonElement.getAsString());
				return OffsetDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
			} catch(ParseException pe1) {
				sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				try {
					Date date = sdf.parse(jsonElement.getAsString());
					return OffsetDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
				} catch(ParseException pe2) {
					sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
					try {
						Date date = sdf.parse(jsonElement.getAsString());
						return OffsetDateTime.ofInstant(date.toInstant(), ZoneId.of("UTC"));
					} catch(ParseException pe3) {
						sdf = new SimpleDateFormat("yyyy-MM-dd");
						try {
							Date date = sdf.parse(jsonElement.getAsString());
							return OffsetDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
						} catch(ParseException pe4) {
							return null;
						}
					}
				}
			}
		}
	}

}
