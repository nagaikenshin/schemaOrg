package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WP_HEADER;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPHeader;

@ExternalDomain
public class WPHeaderConverter implements DomainConverter<WPHeader, String> {

	@Override
	public String fromDomainToValue(WPHeader domain) {
		return domain.getNativeValue();
	}

	@Override
	public WPHeader fromValueToDomain(String value) {
		return new WP_HEADER(value);
	}

}