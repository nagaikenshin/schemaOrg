package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HEIGHT;
import org.kyojo.schemaorg.m3n4.core.Container.Height;

@ExternalDomain
public class HeightConverter implements DomainConverter<Height, String> {

	@Override
	public String fromDomainToValue(Height domain) {
		return domain.getNativeValue();
	}

	@Override
	public Height fromValueToDomain(String value) {
		return new HEIGHT(value);
	}

}