package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.STRENGTH_UNIT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StrengthUnit;

@ExternalDomain
public class StrengthUnitConverter implements DomainConverter<StrengthUnit, String> {

	@Override
	public String fromDomainToValue(StrengthUnit domain) {
		return domain.getNativeValue();
	}

	@Override
	public StrengthUnit fromValueToDomain(String value) {
		return new STRENGTH_UNIT(value);
	}

}
