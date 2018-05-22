package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CREDIT_CARD;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreditCard;

@ExternalDomain
public class CreditCardConverter implements DomainConverter<CreditCard, String> {

	@Override
	public String fromDomainToValue(CreditCard domain) {
		return domain.getNativeValue();
	}

	@Override
	public CreditCard fromValueToDomain(String value) {
		return new CREDIT_CARD(value);
	}

}
