package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REQUIRES_SUBSCRIPTION;
import org.kyojo.schemaOrg.m3n3.core.Container.RequiresSubscription;

@ExternalDomain
public class RequiresSubscriptionConverter implements DomainConverter<RequiresSubscription, Boolean> {

	@Override
	public Boolean fromDomainToValue(RequiresSubscription domain) {
		return domain.getNativeValue();
	}

	@Override
	public RequiresSubscription fromValueToDomain(Boolean value) {
		return new REQUIRES_SUBSCRIPTION(value);
	}

}
