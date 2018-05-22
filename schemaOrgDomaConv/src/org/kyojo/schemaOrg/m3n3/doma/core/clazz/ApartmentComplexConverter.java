package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.APARTMENT_COMPLEX;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ApartmentComplex;

@ExternalDomain
public class ApartmentComplexConverter implements DomainConverter<ApartmentComplex, String> {

	@Override
	public String fromDomainToValue(ApartmentComplex domain) {
		return domain.getNativeValue();
	}

	@Override
	public ApartmentComplex fromValueToDomain(String value) {
		return new APARTMENT_COMPLEX(value);
	}

}
