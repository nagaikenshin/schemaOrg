package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SITE_NAVIGATION_ELEMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SiteNavigationElement;

@ExternalDomain
public class SiteNavigationElementConverter implements DomainConverter<SiteNavigationElement, String> {

	@Override
	public String fromDomainToValue(SiteNavigationElement domain) {
		return domain.getNativeValue();
	}

	@Override
	public SiteNavigationElement fromValueToDomain(String value) {
		return new SITE_NAVIGATION_ELEMENT(value);
	}

}
