package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUTHORIZE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AuthorizeAction;

@ExternalDomain
public class AuthorizeActionConverter implements DomainConverter<AuthorizeAction, String> {

	@Override
	public String fromDomainToValue(AuthorizeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AuthorizeAction fromValueToDomain(String value) {
		return new AUTHORIZE_ACTION(value);
	}

}
