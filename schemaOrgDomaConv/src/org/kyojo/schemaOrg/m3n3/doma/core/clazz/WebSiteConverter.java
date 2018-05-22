package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WEB_SITE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WebSite;

@ExternalDomain
public class WebSiteConverter implements DomainConverter<WebSite, String> {

	@Override
	public String fromDomainToValue(WebSite domain) {
		return domain.getNativeValue();
	}

	@Override
	public WebSite fromValueToDomain(String value) {
		return new WEB_SITE(value);
	}

}
