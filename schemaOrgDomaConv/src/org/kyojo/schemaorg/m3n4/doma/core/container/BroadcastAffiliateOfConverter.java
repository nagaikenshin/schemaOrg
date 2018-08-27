package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BROADCAST_AFFILIATE_OF;
import org.kyojo.schemaorg.m3n4.core.Container.BroadcastAffiliateOf;

@ExternalDomain
public class BroadcastAffiliateOfConverter implements DomainConverter<BroadcastAffiliateOf, String> {

	@Override
	public String fromDomainToValue(BroadcastAffiliateOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastAffiliateOf fromValueToDomain(String value) {
		return new BROADCAST_AFFILIATE_OF(value);
	}

}
