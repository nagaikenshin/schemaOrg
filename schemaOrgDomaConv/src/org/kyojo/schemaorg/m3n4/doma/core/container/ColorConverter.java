package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COLOR;
import org.kyojo.schemaorg.m3n4.core.Container.Color;

@ExternalDomain
public class ColorConverter implements DomainConverter<Color, String> {

	@Override
	public String fromDomainToValue(Color domain) {
		return domain.getNativeValue();
	}

	@Override
	public Color fromValueToDomain(String value) {
		return new COLOR(value);
	}

}
