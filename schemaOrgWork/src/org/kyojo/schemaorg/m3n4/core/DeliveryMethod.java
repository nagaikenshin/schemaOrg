package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
