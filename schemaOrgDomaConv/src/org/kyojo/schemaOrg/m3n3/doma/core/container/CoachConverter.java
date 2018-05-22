package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COACH;
import org.kyojo.schemaOrg.m3n3.core.Container.Coach;

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
