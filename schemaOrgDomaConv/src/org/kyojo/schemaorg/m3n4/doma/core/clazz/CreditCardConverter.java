package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CREDIT_CARD;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreditCard;

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
