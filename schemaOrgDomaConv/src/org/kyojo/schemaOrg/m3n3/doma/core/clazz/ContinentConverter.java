package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTINENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Continent;

@ExternalDomain
public class ContinentConverter implements DomainConverter<Continent, String> {

	@Override
	public String fromDomainToValue(Continent domain) {
		return domain.getNativeValue();
	}

	@Override
	public Continent fromValueToDomain(String value) {
		return new CONTINENT(value);
	}

}
