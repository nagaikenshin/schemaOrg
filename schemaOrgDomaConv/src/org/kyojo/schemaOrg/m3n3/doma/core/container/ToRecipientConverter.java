package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TO_RECIPIENT;
import org.kyojo.schemaOrg.m3n3.core.Container.ToRecipient;

@ExternalDomain
public class ToRecipientConverter implements DomainConverter<ToRecipient, String> {

	@Override
	public String fromDomainToValue(ToRecipient domain) {
		return domain.getNativeValue();
	}

	@Override
	public ToRecipient fromValueToDomain(String value) {
		return new TO_RECIPIENT(value);
	}

}
