package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RECIPIENT;
import org.kyojo.schemaOrg.m3n3.core.Container.Recipient;

@ExternalDomain
public class RecipientConverter implements DomainConverter<Recipient, String> {

	@Override
	public String fromDomainToValue(Recipient domain) {
		return domain.getNativeValue();
	}

	@Override
	public Recipient fromValueToDomain(String value) {
		return new RECIPIENT(value);
	}

}
