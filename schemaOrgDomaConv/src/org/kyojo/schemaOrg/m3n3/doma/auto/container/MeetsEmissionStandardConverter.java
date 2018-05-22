package org.kyojo.schemaOrg.m3n3.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.MEETS_EMISSION_STANDARD;
import org.kyojo.schemaOrg.m3n3.auto.Container.MeetsEmissionStandard;

@ExternalDomain
public class MeetsEmissionStandardConverter implements DomainConverter<MeetsEmissionStandard, String> {

	@Override
	public String fromDomainToValue(MeetsEmissionStandard domain) {
		return domain.getNativeValue();
	}

	@Override
	public MeetsEmissionStandard fromValueToDomain(String value) {
		return new MEETS_EMISSION_STANDARD(value);
	}

}
