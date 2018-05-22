package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HEIGHT;
import org.kyojo.schemaOrg.m3n3.core.Container.Height;

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
