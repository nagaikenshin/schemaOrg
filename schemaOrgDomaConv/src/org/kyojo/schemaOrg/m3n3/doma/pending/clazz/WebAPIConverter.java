package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.WEB_API;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.WebAPI;

@ExternalDomain
public class WebAPIConverter implements DomainConverter<WebAPI, String> {

	@Override
	public String fromDomainToValue(WebAPI domain) {
		return domain.getNativeValue();
	}

	@Override
	public WebAPI fromValueToDomain(String value) {
		return new WEB_API(value);
	}

}
