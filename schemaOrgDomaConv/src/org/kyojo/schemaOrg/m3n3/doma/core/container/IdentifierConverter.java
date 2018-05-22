package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IDENTIFIER;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;

@ExternalDomain
public class IdentifierConverter implements DomainConverter<Identifier, String> {

	@Override
	public String fromDomainToValue(Identifier domain) {
		return domain.getNativeValue();
	}

	@Override
	public Identifier fromValueToDomain(String value) {
		return new IDENTIFIER(value);
	}

}
