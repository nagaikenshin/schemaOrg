package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.OWNERSHIP_FUNDING_INFO;
import org.kyojo.schemaorg.m3n5.pending.Container.OwnershipFundingInfo;

@ExternalDomain
public class OwnershipFundingInfoConverter implements DomainConverter<OwnershipFundingInfo, String> {

	@Override
	public String fromDomainToValue(OwnershipFundingInfo domain) {
		return domain.getNativeValue();
	}

	@Override
	public OwnershipFundingInfo fromValueToDomain(String value) {
		return new OWNERSHIP_FUNDING_INFO(value);
	}

}
