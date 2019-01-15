package org.kyojo.schemaorg.sample;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;
import org.kyojo.minion.My;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.SimpleJsonWalker;
import org.kyojo.schemaorg.SimpleJsonWalker.JsonLdAtIdStringGiven;
import org.kyojo.schemaorg.SimpleJsonWalker.JsonLdThingStringGiven;
import org.kyojo.schemaorg.m3n4.core.Clazz.NewsArticle;

public class SimpleJsonWalkerTest {

	public static String jsonLd;

	@BeforeClass
    public static void setUpBeforeClass() throws Exception {
		String path = SimpleJsonWalkerTest.class.getClassLoader().getResource("jsonLdNewsArticle.json").getPath();
		Scanner scn = new Scanner(new File(path));
		jsonLd = scn.useDelimiter("\\Z").next();
		scn.close();
	}

	@Test
	public void analyzeNewsArticle() {
		Map<String, JsonLdThingStringGiven> thingStrModeMap = new HashMap<>();
		thingStrModeMap.put("url", JsonLdThingStringGiven.AS_URL);
		thingStrModeMap.put("image", JsonLdThingStringGiven.AS_URL);
		thingStrModeMap.put("item", JsonLdThingStringGiven.AS_THING_IDENTIFIER_URL);
		Map<String, String> jsonLdRootMap = new HashMap<>();
		String json1 = SimpleJsonWalker.jsonLdToJson(jsonLd, jsonLdRootMap,
				thingStrModeMap, JsonLdAtIdStringGiven.AS_AUTO);
		String json2 = SimpleJsonWalker.formatJson(json1, "\t");
		System.out.println(json2);

		NewsArticle newsArticle = My.deminion(json1, NewsArticle.class);
		String json3 = SimpleJsonBuilder.toJson(newsArticle);
		System.out.println(SimpleJsonWalker.formatJson(json3, "\t"));
	}

}
