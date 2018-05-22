package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.INCREASES_RISK_OF;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IncreasesRiskOf;

@ExternalDomain
public class IncreasesRiskOfConverter implements DomainConverter<IncreasesRiskOf, String> {

	@Override
	public String fromDomainToValue(IncreasesRiskOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncreasesRiskOf fromValueToDomain(String value) {
		return new INCREASES_RISK_OF(value);
	}

}
