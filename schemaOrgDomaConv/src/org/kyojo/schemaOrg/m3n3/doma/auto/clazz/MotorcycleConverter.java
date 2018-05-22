package org.kyojo.schemaOrg.m3n3.doma.auto.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.MOTORCYCLE;
import org.kyojo.schemaOrg.m3n3.auto.Clazz.Motorcycle;

@ExternalDomain
public class MotorcycleConverter implements DomainConverter<Motorcycle, String> {

	@Override
	public String fromDomainToValue(Motorcycle domain) {
		return domain.getNativeValue();
	}

	@Override
	public Motorcycle fromValueToDomain(String value) {
		return new MOTORCYCLE(value);
	}

}
