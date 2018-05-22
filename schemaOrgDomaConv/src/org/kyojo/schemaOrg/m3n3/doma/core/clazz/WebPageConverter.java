package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WEB_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WebPage;

@ExternalDomain
public class WebPageConverter implements DomainConverter<WebPage, String> {

	@Override
	public String fromDomainToValue(WebPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public WebPage fromValueToDomain(String value) {
		return new WEB_PAGE(value);
	}

}
