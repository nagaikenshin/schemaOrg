package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

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
