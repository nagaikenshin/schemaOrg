package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WEB_APPLICATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebApplication;

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
