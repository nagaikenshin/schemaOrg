package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STRENGTH_UNIT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.StrengthUnit;

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