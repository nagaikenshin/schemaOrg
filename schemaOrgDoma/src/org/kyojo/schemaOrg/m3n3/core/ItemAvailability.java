package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/ItemAvailability")
@CamelizedName("itemAvailability")
@ConstantizedName("ITEM_AVAILABILITY")
public interface ItemAvailability extends Clazz.ItemAvailability {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Discontinued")
	@SchemaOrgLabel("Discontinued")
	@SchemaOrgComment(""
			+ "Indicates that the item has been discontinued.")
	@CamelizedName("discontinued")
	@ConstantizedName("DISCONTINUED")
	@SampleValue("1")
	public interface Discontinued extends ItemAvailability {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InStock")
	@SchemaOrgLabel("InStock")
	@SchemaOrgComment("Indicates that the item is in stock.")
	@CamelizedName("inStock")
	@ConstantizedName("IN_STOCK")
	@SampleValue("2")
	public interface InStock extends ItemAvailability {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InStoreOnly")
	@SchemaOrgLabel("InStoreOnly")
	@SchemaOrgComment(""
			+ "Indicates that the item is available only at physical locations.")
	@CamelizedName("inStoreOnly")
	@ConstantizedName("IN_STORE_ONLY")
	@SampleValue("3")
	public interface InStoreOnly extends ItemAvailability {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LimitedAvailability")
	@SchemaOrgLabel("LimitedAvailability")
	@SchemaOrgComment(""
			+ "Indicates that the item has limited availability.")
	@CamelizedName("limitedAvailability")
	@ConstantizedName("LIMITED_AVAILABILITY")
	@SampleValue("4")
	public interface LimitedAvailability extends ItemAvailability {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OnlineOnly")
	@SchemaOrgLabel("OnlineOnly")
	@SchemaOrgComment(""
			+ "Indicates that the item is available only online.")
	@CamelizedName("onlineOnly")
	@ConstantizedName("ONLINE_ONLY")
	@SampleValue("5")
	public interface OnlineOnly extends ItemAvailability {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OutOfStock")
	@SchemaOrgLabel("OutOfStock")
	@SchemaOrgComment(""
			+ "Indicates that the item is out of stock.")
	@CamelizedName("outOfStock")
	@ConstantizedName("OUT_OF_STOCK")
	@SampleValue("6")
	public interface OutOfStock extends ItemAvailability {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PreOrder")
	@SchemaOrgLabel("PreOrder")
	@SchemaOrgComment(""
			+ "Indicates that the item is available for pre-order, but will be delivered when"
			+ " generally available.")
	@CamelizedName("preOrder")
	@ConstantizedName("PRE_ORDER")
	@SampleValue("7")
	public interface PreOrder extends ItemAvailability {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PreSale")
	@SchemaOrgLabel("PreSale")
	@SchemaOrgComment(""
			+ "Indicates that the item is available for ordering and delivery before general"
			+ " availability.")
	@CamelizedName("preSale")
	@ConstantizedName("PRE_SALE")
	@SampleValue("8")
	public interface PreSale extends ItemAvailability {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SoldOut")
	@SchemaOrgLabel("SoldOut")
	@SchemaOrgComment("Indicates that the item has sold out.")
	@CamelizedName("soldOut")
	@ConstantizedName("SOLD_OUT")
	@SampleValue("9")
	public interface SoldOut extends ItemAvailability {

	}

}
