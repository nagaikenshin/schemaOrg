package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CIRCLE;
import org.kyojo.schemaorg.m3n5.core.Container.Circle;

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
