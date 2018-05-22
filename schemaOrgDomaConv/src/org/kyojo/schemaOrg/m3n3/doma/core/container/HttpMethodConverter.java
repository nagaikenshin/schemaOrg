package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HTTP_METHOD;
import org.kyojo.schemaOrg.m3n3.core.Container.HttpMethod;

@ExternalDomain
public class HttpMethodConverter implements DomainConverter<HttpMethod, String> {

	@Override
	public String fromDomainToValue(HttpMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public HttpMethod fromValueToDomain(String value) {
		return new HTTP_METHOD(value);
	}

}
