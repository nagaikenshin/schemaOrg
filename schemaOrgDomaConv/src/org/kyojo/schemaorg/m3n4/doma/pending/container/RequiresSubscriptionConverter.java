package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.REQUIRES_SUBSCRIPTION;
import org.kyojo.schemaorg.m3n4.pending.Container.RequiresSubscription;

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
