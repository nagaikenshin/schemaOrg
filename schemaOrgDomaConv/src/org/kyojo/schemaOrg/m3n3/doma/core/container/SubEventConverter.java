package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUB_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Container.SubEvent;

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
