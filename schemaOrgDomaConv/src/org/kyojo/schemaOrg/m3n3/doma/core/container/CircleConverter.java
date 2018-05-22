package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CIRCLE;
import org.kyojo.schemaOrg.m3n3.core.Container.Circle;

@ExternalDomain
public class CircleConverter implements DomainConverter<Circle, String> {

	@Override
	public String fromDomainToValue(Circle domain) {
		return domain.getNativeValue();
	}

	@Override
	public Circle fromValueToDomain(String value) {
		return new CIRCLE(value);
	}

}
