package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.THEATER_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TheaterEvent;

@ExternalDomain
public class TheaterEventConverter implements DomainConverter<TheaterEvent, String> {

	@Override
	public String fromDomainToValue(TheaterEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public TheaterEvent fromValueToDomain(String value) {
		return new THEATER_EVENT(value);
	}

}
