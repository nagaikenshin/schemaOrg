package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.INCLUDED_RISK_FACTOR;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.IncludedRiskFactor;

@ExternalDomain
public class IncludedRiskFactorConverter implements DomainConverter<IncludedRiskFactor, String> {

	@Override
	public String fromDomainToValue(IncludedRiskFactor domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncludedRiskFactor fromValueToDomain(String value) {
		return new INCLUDED_RISK_FACTOR(value);
	}

}
