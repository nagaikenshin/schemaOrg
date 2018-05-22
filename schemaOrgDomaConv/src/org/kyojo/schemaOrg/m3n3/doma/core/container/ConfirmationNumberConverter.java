package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONFIRMATION_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.ConfirmationNumber;

@ExternalDomain
public class ConfirmationNumberConverter implements DomainConverter<ConfirmationNumber, String> {

	@Override
	public String fromDomainToValue(ConfirmationNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public ConfirmationNumber fromValueToDomain(String value) {
		return new CONFIRMATION_NUMBER(value);
	}

}
