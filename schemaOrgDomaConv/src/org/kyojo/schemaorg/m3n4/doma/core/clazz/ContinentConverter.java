package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CONTINENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.Continent;

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
