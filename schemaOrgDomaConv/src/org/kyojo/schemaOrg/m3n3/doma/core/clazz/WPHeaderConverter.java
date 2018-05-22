package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WP_HEADER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WPHeader;

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
