package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EMAIL;
import org.kyojo.schemaorg.m3n5.core.Container.Email;

@ExternalDomain
public class EmailConverter implements DomainConverter<Email, String> {

	@Override
	public String fromDomainToValue(Email domain) {
		return domain.getNativeValue();
	}

	@Override
	public Email fromValueToDomain(String value) {
		return new EMAIL(value);
	}

}