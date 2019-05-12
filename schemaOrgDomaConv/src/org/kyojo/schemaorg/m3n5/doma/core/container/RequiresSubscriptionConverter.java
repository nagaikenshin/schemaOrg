package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REQUIRES_SUBSCRIPTION;
import org.kyojo.schemaorg.m3n5.core.Container.RequiresSubscription;

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
