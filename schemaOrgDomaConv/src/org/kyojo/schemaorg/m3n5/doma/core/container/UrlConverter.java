package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.URL;
import org.kyojo.schemaorg.m3n5.core.Container.Url;

@ExternalDomain
public class UrlConverter implements DomainConverter<Url, String> {

	@Override
	public String fromDomainToValue(Url domain) {
		return domain.getNativeValue();
	}

	@Override
	public Url fromValueToDomain(String value) {
		return new URL(value);
	}

}
