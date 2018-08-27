package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CC_RECIPIENT;
import org.kyojo.schemaorg.m3n4.core.Container.CcRecipient;

@ExternalDomain
public class CcRecipientConverter implements DomainConverter<CcRecipient, String> {

	@Override
	public String fromDomainToValue(CcRecipient domain) {
		return domain.getNativeValue();
	}

	@Override
	public CcRecipient fromValueToDomain(String value) {
		return new CC_RECIPIENT(value);
	}

}
