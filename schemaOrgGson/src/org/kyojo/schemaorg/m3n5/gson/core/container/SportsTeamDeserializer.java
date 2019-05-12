package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SPORTS_TEAM;
import org.kyojo.schemaorg.m3n5.core.Container.SportsTeam;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SportsTeamDeserializer implements JsonDeserializer<SportsTeam> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SportsTeam deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPORTS_TEAM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPORTS_TEAM(), SportsTeam.class, SPORTS_TEAM.class, fldMap);
	}

}
