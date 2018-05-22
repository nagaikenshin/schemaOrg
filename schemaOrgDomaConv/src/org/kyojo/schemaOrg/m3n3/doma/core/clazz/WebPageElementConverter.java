package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WEB_PAGE_ELEMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WebPageElement;

@ExternalDomain
public class WebPageElementConverter implements DomainConverter<WebPageElement, String> {

	@Override
	public String fromDomainToValue(WebPageElement domain) {
		return domain.getNativeValue();
	}

	@Override
	public WebPageElement fromValueToDomain(String value) {
		return new WEB_PAGE_ELEMENT(value);
	}

}
