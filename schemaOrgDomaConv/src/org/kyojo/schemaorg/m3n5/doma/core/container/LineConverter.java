package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LINE;
import org.kyojo.schemaorg.m3n5.core.Container.Line;

@ExternalDomain
public class LineConverter implements DomainConverter<Line, String> {

	@Override
	public String fromDomainToValue(Line domain) {
		return domain.getNativeValue();
	}

	@Override
	public Line fromValueToDomain(String value) {
		return new LINE(value);
	}

}
