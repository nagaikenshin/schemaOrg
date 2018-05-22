package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TENNIS_COMPLEX;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TennisComplex;

@ExternalDomain
public class TennisComplexConverter implements DomainConverter<TennisComplex, String> {

	@Override
	public String fromDomainToValue(TennisComplex domain) {
		return domain.getNativeValue();
	}

	@Override
	public TennisComplex fromValueToDomain(String value) {
		return new TENNIS_COMPLEX(value);
	}

}
