package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WP_FOOTER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WPFooter;

@ExternalDomain
public class WPFooterConverter implements DomainConverter<WPFooter, String> {

	@Override
	public String fromDomainToValue(WPFooter domain) {
		return domain.getNativeValue();
	}

	@Override
	public WPFooter fromValueToDomain(String value) {
		return new WP_FOOTER(value);
	}

}
