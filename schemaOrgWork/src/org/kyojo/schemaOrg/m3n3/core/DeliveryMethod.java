package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/DeliveryMethod")
@CamelizedName("deliveryMethod")
@ConstantizedName("DELIVERY_METHOD")
public interface DeliveryMethod extends Clazz.DeliveryMethod {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OnSitePickup")
	@SchemaOrgLabel("OnSitePickup")
	@SchemaOrgComment(""
			+ "A DeliveryMethod in which an item is collected on site, e.g. in a store or at a"
			+ " box office.")
	@CamelizedName("onSitePickup")
	@ConstantizedName("ON_SITE_PICKUP")
	@SampleValue("1")
	public interface OnSitePickup extends DeliveryMethod {

	}

}
