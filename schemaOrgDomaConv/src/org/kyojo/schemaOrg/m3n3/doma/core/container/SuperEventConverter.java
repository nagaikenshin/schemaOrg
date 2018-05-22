package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUPER_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Container.SuperEvent;

@ExternalDomain
public class SuperEventConverter implements DomainConverter<SuperEvent, String> {

	@Override
	public String fromDomainToValue(SuperEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public SuperEvent fromValueToDomain(String value) {
		return new SUPER_EVENT(value);
	}

}
