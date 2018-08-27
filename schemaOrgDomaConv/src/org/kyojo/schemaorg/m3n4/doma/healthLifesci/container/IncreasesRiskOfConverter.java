package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.INCREASES_RISK_OF;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.IncreasesRiskOf;

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
