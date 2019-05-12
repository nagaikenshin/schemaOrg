package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TENNIS_COMPLEX;
import org.kyojo.schemaorg.m3n5.core.Clazz.TennisComplex;

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
