package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DOSE_UNIT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DoseUnit;

@ExternalDomain
public class DoseUnitConverter implements DomainConverter<DoseUnit, String> {

	@Override
	public String fromDomainToValue(DoseUnit domain) {
		return domain.getNativeValue();
	}

	@Override
	public DoseUnit fromValueToDomain(String value) {
		return new DOSE_UNIT(value);
	}

}
