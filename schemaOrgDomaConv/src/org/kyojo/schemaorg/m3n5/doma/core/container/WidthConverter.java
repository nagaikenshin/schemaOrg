package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WIDTH;
import org.kyojo.schemaorg.m3n5.core.Container.Width;

@ExternalDomain
public class WidthConverter implements DomainConverter<Width, String> {

	@Override
	public String fromDomainToValue(Width domain) {
		return domain.getNativeValue();
	}

	@Override
	public Width fromValueToDomain(String value) {
		return new WIDTH(value);
	}

}
