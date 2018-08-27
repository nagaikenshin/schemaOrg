package org.kyojo.schemaorg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.core.impl.BREWERY;
import org.kyojo.schemaorg.m3n3.core.Clazz.Brewery;

@ExternalDomain
public class BreweryConverter implements DomainConverter<Brewery, String> {

	@Override
	public String fromDomainToValue(Brewery domain) {
		return domain.getNativeValue();
	}

	@Override
	public Brewery fromValueToDomain(String value) {
		return new BREWERY(value);
	}

}
