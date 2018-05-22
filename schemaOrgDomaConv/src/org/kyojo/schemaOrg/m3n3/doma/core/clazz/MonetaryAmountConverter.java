package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MONETARY_AMOUNT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount;

@ExternalDomain
public class MonetaryAmountConverter implements DomainConverter<MonetaryAmount, String> {

	@Override
	public String fromDomainToValue(MonetaryAmount domain) {
		return domain.getNativeValue();
	}

	@Override
	public MonetaryAmount fromValueToDomain(String value) {
		return new MONETARY_AMOUNT(value);
	}

}
