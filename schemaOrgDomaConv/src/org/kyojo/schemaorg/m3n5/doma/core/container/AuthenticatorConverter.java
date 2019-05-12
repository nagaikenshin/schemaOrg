package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AUTHENTICATOR;
import org.kyojo.schemaorg.m3n5.core.Container.Authenticator;

@ExternalDomain
public class AuthenticatorConverter implements DomainConverter<Authenticator, String> {

	@Override
	public String fromDomainToValue(Authenticator domain) {
		return domain.getNativeValue();
	}

	@Override
	public Authenticator fromValueToDomain(String value) {
		return new AUTHENTICATOR(value);
	}

}
