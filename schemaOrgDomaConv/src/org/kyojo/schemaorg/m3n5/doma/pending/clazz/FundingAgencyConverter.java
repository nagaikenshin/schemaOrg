package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.FUNDING_AGENCY;
import org.kyojo.schemaorg.m3n5.pending.Clazz.FundingAgency;

@ExternalDomain
public class FundingAgencyConverter implements DomainConverter<FundingAgency, String> {

	@Override
	public String fromDomainToValue(FundingAgency domain) {
		return domain.getNativeValue();
	}

	@Override
	public FundingAgency fromValueToDomain(String value) {
		return new FUNDING_AGENCY(value);
	}

}
