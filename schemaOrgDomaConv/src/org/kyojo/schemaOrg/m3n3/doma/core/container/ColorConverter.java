package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COLOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Color;

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
