package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.URL;
import org.kyojo.schemaorg.m3n5.core.Clazz;

@ExternalDomain
public class URLConverter implements DomainConverter<Clazz.URL, String> {

	@Override
	public String fromDomainToValue(Clazz.URL domain) {
		return domain.getNativeValue();
	}

	@Override
	public Clazz.URL fromValueToDomain(String value) {
		return new URL(value);
	}

}
