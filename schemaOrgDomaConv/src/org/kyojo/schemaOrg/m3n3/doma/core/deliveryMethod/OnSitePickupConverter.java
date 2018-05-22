package org.kyojo.schemaOrg.m3n3.doma.core.deliveryMethod;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.deliveryMethod.ON_SITE_PICKUP;
import org.kyojo.schemaOrg.m3n3.core.DeliveryMethod.OnSitePickup;

@ExternalDomain
public class OnSitePickupConverter implements DomainConverter<OnSitePickup, String> {

	@Override
	public String fromDomainToValue(OnSitePickup domain) {
		return domain.getNativeValue();
	}

	@Override
	public OnSitePickup fromValueToDomain(String value) {
		return new ON_SITE_PICKUP(value);
	}

}
