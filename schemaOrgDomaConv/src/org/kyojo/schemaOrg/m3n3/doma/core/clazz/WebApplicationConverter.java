package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WEB_APPLICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WebApplication;

@ExternalDomain
public class WebApplicationConverter implements DomainConverter<WebApplication, String> {

	@Override
	public String fromDomainToValue(WebApplication domain) {
		return domain.getNativeValue();
	}

	@Override
	public WebApplication fromValueToDomain(String value) {
		return new WEB_APPLICATION(value);
	}

}
