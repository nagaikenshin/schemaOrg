package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BCC_RECIPIENT;
import org.kyojo.schemaOrg.m3n3.core.Container.BccRecipient;

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
