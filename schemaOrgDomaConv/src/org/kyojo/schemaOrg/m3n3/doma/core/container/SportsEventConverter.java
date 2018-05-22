package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPORTS_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Container.SportsEvent;

@ExternalDomain
public class SportsEventConverter implements DomainConverter<SportsEvent, String> {

	@Override
	public String fromDomainToValue(SportsEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public SportsEvent fromValueToDomain(String value) {
		return new SPORTS_EVENT(value);
	}

}
