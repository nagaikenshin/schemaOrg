package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.AVAILABLE_STRENGTH;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.AvailableStrength;

@ExternalDomain
public class AvailableStrengthConverter implements DomainConverter<AvailableStrength, String> {

	@Override
	public String fromDomainToValue(AvailableStrength domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableStrength fromValueToDomain(String value) {
		return new AVAILABLE_STRENGTH(value);
	}

}