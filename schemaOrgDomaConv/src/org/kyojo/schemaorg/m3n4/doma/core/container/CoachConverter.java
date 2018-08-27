package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COACH;
import org.kyojo.schemaorg.m3n4.core.Container.Coach;

@ExternalDomain
public class CoachConverter implements DomainConverter<Coach, String> {

	@Override
	public String fromDomainToValue(Coach domain) {
		return domain.getNativeValue();
	}

	@Override
	public Coach fromValueToDomain(String value) {
		return new COACH(value);
	}

}
