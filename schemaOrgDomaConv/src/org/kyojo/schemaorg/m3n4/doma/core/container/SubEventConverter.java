package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SUB_EVENT;
import org.kyojo.schemaorg.m3n4.core.Container.SubEvent;

@ExternalDomain
public class SubEventConverter implements DomainConverter<SubEvent, String> {

	@Override
	public String fromDomainToValue(SubEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubEvent fromValueToDomain(String value) {
		return new SUB_EVENT(value);
	}

}
