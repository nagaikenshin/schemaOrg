package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WP_SIDE_BAR;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPSideBar;

@ExternalDomain
public class WPSideBarConverter implements DomainConverter<WPSideBar, String> {

	@Override
	public String fromDomainToValue(WPSideBar domain) {
		return domain.getNativeValue();
	}

	@Override
	public WPSideBar fromValueToDomain(String value) {
		return new WP_SIDE_BAR(value);
	}

}