package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENERGY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Energy;

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
