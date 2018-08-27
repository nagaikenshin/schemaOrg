package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.RISK_FACTOR;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RiskFactor;

@ExternalDomain
public class RiskFactorConverter implements DomainConverter<RiskFactor, String> {

	@Override
	public String fromDomainToValue(RiskFactor domain) {
		return domain.getNativeValue();
	}

	@Override
	public RiskFactor fromValueToDomain(String value) {
		return new RISK_FACTOR(value);
	}

}
