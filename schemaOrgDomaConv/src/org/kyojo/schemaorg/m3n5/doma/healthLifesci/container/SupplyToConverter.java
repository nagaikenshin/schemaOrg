package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SUPPLY_TO;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SupplyTo;

@ExternalDomain
public class SupplyToConverter implements DomainConverter<SupplyTo, String> {

	@Override
	public String fromDomainToValue(SupplyTo domain) {
		return domain.getNativeValue();
	}

	@Override
	public SupplyTo fromValueToDomain(String value) {
		return new SUPPLY_TO(value);
	}

}
