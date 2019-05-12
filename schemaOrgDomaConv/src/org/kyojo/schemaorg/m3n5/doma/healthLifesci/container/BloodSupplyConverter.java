package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.BLOOD_SUPPLY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.BloodSupply;

@ExternalDomain
public class BloodSupplyConverter implements DomainConverter<BloodSupply, String> {

	@Override
	public String fromDomainToValue(BloodSupply domain) {
		return domain.getNativeValue();
	}

	@Override
	public BloodSupply fromValueToDomain(String value) {
		return new BLOOD_SUPPLY(value);
	}

}
