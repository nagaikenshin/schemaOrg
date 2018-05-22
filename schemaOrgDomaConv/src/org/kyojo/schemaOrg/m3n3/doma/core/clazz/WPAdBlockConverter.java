package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WP_AD_BLOCK;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WPAdBlock;

@ExternalDomain
public class WPAdBlockConverter implements DomainConverter<WPAdBlock, String> {

	@Override
	public String fromDomainToValue(WPAdBlock domain) {
		return domain.getNativeValue();
	}

	@Override
	public WPAdBlock fromValueToDomain(String value) {
		return new WP_AD_BLOCK(value);
	}

}
