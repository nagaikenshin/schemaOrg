package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ESTIMATES_RISK_OF;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.EstimatesRiskOf;

@ExternalDomain
public class EstimatesRiskOfConverter implements DomainConverter<EstimatesRiskOf, String> {

	@Override
	public String fromDomainToValue(EstimatesRiskOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public EstimatesRiskOf fromValueToDomain(String value) {
		return new ESTIMATES_RISK_OF(value);
	}

}
