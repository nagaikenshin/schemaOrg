package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CC_RECIPIENT;
import org.kyojo.schemaOrg.m3n3.core.Container.CcRecipient;

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
