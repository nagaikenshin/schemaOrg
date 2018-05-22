package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.APARTMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Apartment;

@ExternalDomain
public class ApartmentConverter implements DomainConverter<Apartment, String> {

	@Override
	public String fromDomainToValue(Apartment domain) {
		return domain.getNativeValue();
	}

	@Override
	public Apartment fromValueToDomain(String value) {
		return new APARTMENT(value);
	}

}
