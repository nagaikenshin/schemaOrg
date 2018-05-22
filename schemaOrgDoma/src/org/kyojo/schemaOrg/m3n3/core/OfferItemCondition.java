package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

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
