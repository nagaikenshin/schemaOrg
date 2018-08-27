package org.kyojo.schemaorg.m3n4.doma.auto.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.MOTORCYCLE;
import org.kyojo.schemaorg.m3n4.auto.Clazz.Motorcycle;

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
