package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ENERGY;
import org.kyojo.schemaorg.m3n4.core.Clazz.Energy;

@ExternalDomain
public class EnergyConverter implements DomainConverter<Energy, String> {

	@Override
	public String fromDomainToValue(Energy domain) {
		return domain.getNativeValue();
	}

	@Override
	public Energy fromValueToDomain(String value) {
		return new ENERGY(value);
	}

}
