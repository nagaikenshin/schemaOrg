package org.kyojo.schemaorg.m3n4.gson.bib.bookFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.bib.bookFormatType.GRAPHIC_NOVEL;
import org.kyojo.schemaorg.m3n4.bib.BookFormatType.GraphicNovel;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GraphicNovelDeserializer implements JsonDeserializer<GraphicNovel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GraphicNovel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GRAPHIC_NOVEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GRAPHIC_NOVEL(), GraphicNovel.class, GRAPHIC_NOVEL.class, fldMap);
	}

}
