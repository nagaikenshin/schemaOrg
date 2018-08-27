package org.kyojo.schemaorg.m3n3.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/ItemListOrderType")
@CamelizedName("itemListOrderType")
@ConstantizedName("ITEM_LIST_ORDER_TYPE")
public interface ItemListOrderType extends Clazz.ItemListOrderType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ItemListOrderAscending")
	@SchemaOrgLabel("ItemListOrderAscending")
	@SchemaOrgComment(""
			+ "An ItemList ordered with lower values listed first.")
	@CamelizedName("itemListOrderAscending")
	@ConstantizedName("ITEM_LIST_ORDER_ASCENDING")
	@SampleValue("1")
	public interface ItemListOrderAscending extends ItemListOrderType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ItemListOrderDescending")
	@SchemaOrgLabel("ItemListOrderDescending")
	@SchemaOrgComment(""
			+ "An ItemList ordered with higher values listed first.")
	@CamelizedName("itemListOrderDescending")
	@ConstantizedName("ITEM_LIST_ORDER_DESCENDING")
	@SampleValue("2")
	public interface ItemListOrderDescending extends ItemListOrderType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ItemListUnordered")
	@SchemaOrgLabel("ItemListUnordered")
	@SchemaOrgComment(""
			+ "An ItemList ordered with no explicit order.")
	@CamelizedName("itemListUnordered")
	@ConstantizedName("ITEM_LIST_UNORDERED")
	@SampleValue("0")
	public interface ItemListUnordered extends ItemListOrderType {

	}

}
