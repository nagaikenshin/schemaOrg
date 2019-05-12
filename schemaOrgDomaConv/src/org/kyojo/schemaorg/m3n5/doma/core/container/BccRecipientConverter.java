package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BCC_RECIPIENT;
import org.kyojo.schemaorg.m3n5.core.Container.BccRecipient;

@ExternalDomain
public class BccRecipientConverter implements DomainConverter<BccRecipient, String> {

	@Override
	public String fromDomainToValue(BccRecipient domain) {
		return domain.getNativeValue();
	}

	@Override
	public BccRecipient fromValueToDomain(String value) {
		return new BCC_RECIPIENT(value);
	}

}