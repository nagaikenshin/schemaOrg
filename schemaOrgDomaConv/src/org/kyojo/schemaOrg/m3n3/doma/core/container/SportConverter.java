package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPORT;
import org.kyojo.schemaOrg.m3n3.core.Container.Sport;

@ExternalDomain
public class SportConverter implements DomainConverter<Sport, String> {

	@Override
	public String fromDomainToValue(Sport domain) {
		return domain.getNativeValue();
	}

	@Override
	public Sport fromValueToDomain(String value) {
		return new SPORT(value);
	}

}
