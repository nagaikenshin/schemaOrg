package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DANCE_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.DanceEvent;

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
