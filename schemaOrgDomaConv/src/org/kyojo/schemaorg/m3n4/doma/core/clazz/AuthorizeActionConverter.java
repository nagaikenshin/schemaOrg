package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AUTHORIZE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.AuthorizeAction;

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
