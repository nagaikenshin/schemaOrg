package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DANCE_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DanceEvent;

@ExternalDomain
public class DanceEventConverter implements DomainConverter<DanceEvent, String> {

	@Override
	public String fromDomainToValue(DanceEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public DanceEvent fromValueToDomain(String value) {
		return new DANCE_EVENT(value);
	}

}
