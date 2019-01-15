package org.kyojo.schemaorg.sample;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.BreadcrumbList;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.ListItem;
import org.kyojo.schemaorg.m3n4.core.Container.Author;
import org.kyojo.schemaorg.m3n4.core.Container.ItemListElement;
import org.kyojo.schemaorg.m3n4.core.impl.AUTHOR;
import org.kyojo.schemaorg.m3n4.core.impl.BREADCRUMB_LIST;
import org.kyojo.schemaorg.m3n4.core.impl.CREATIVE_WORK;
import org.kyojo.schemaorg.m3n4.core.impl.IDENTIFIER;
import org.kyojo.schemaorg.m3n4.core.impl.ITEM;
import org.kyojo.schemaorg.m3n4.core.impl.ITEM_LIST_ELEMENT;
import org.kyojo.schemaorg.m3n4.core.impl.LIST_ITEM;
import org.kyojo.schemaorg.m3n4.core.impl.PERSON;
import org.kyojo.schemaorg.m3n4.core.impl.POSITION;
import org.kyojo.schemaorg.m3n4.core.impl.THING;

public class SimpleJsonBuilderTest {

	@Test
	public void toJsonCreativeWork() {
		CreativeWork creativeWork = new CREATIVE_WORK();
		Author author = new AUTHOR(new PERSON("誰か"));
		creativeWork.setAuthor(author);
		System.out.println(SimpleJsonBuilder.toJson(creativeWork));
		System.out.println(SimpleJsonBuilder.toJsonLd(creativeWork, CreativeWork.class));
	}

	@Test
	public void toJsonBreadcrumbList() {
		List<ListItem> listItemList = new ArrayList<>();
		ListItem listItem01 = new LIST_ITEM("Books");
		listItem01.setPosition(new POSITION(1L));
		listItem01.setItem(new ITEM(new THING(new IDENTIFIER("https://example.com/books"))));
		listItemList.add(listItem01);
		ListItem listItem02 = new LIST_ITEM("Authors");
		listItem02.setPosition(new POSITION(2L));
		listItem02.setItem(new ITEM(new THING(new IDENTIFIER("https://example.com/books/authors"))));
		listItemList.add(listItem02);
		ItemListElement itemListElement = new ITEM_LIST_ELEMENT();
		itemListElement.setListItemList(listItemList);
		BreadcrumbList breadcrumbList = new BREADCRUMB_LIST();
		breadcrumbList.setItemListElement(itemListElement);
		System.out.println(SimpleJsonBuilder.toJson(breadcrumbList));
		System.out.println(SimpleJsonBuilder.toJsonLd(breadcrumbList, BreadcrumbList.class));
	}

}
