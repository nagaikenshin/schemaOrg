package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SUPER_EVENT;
import org.kyojo.schemaorg.m3n5.core.Container.SuperEvent;

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
