package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SCREENING_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ScreeningEvent;

@ExternalDomain
public class ScreeningEventConverter implements DomainConverter<ScreeningEvent, String> {

	@Override
	public String fromDomainToValue(ScreeningEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public ScreeningEvent fromValueToDomain(String value) {
		return new SCREENING_EVENT(value);
	}

}
