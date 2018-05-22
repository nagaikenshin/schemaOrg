package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BROADCAST_AFFILIATE_OF;
import org.kyojo.schemaOrg.m3n3.core.Container.BroadcastAffiliateOf;

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
