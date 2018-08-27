package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/OfferItemCondition")
@CamelizedName("offerItemCondition")
@ConstantizedName("OFFER_ITEM_CONDITION")
public interface OfferItemCondition extends Clazz.OfferItemCondition {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DamagedCondition")
	@SchemaOrgLabel("DamagedCondition")
	@SchemaOrgComment("Indicates that the item is damaged.")
	@CamelizedName("damagedCondition")
	@ConstantizedName("DAMAGED_CONDITION")
	@SampleValue("1")
	public interface DamagedCondition extends OfferItemCondition {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NewCondition")
	@SchemaOrgLabel("NewCondition")
	@SchemaOrgComment("Indicates that the item is new.")
	@CamelizedName("newCondition")
	@ConstantizedName("NEW_CONDITION")
	@SampleValue("2")
	public interface NewCondition extends OfferItemCondition {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RefurbishedCondition")
	@SchemaOrgLabel("RefurbishedCondition")
	@SchemaOrgComment("Indicates that the item is refurbished.")
	@CamelizedName("refurbishedCondition")
	@ConstantizedName("REFURBISHED_CONDITION")
	@SampleValue("3")
	public interface RefurbishedCondition extends OfferItemCondition {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/UsedCondition")
	@SchemaOrgLabel("UsedCondition")
	@SchemaOrgComment("Indicates that the item is used.")
	@CamelizedName("usedCondition")
	@ConstantizedName("USED_CONDITION")
	@SampleValue("4")
	public interface UsedCondition extends OfferItemCondition {

	}

}
