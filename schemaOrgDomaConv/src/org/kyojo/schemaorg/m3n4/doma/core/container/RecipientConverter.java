package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RECIPIENT;
import org.kyojo.schemaorg.m3n4.core.Container.Recipient;

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
