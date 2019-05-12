package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MONETARY_AMOUNT;
import org.kyojo.schemaorg.m3n5.core.Clazz.MonetaryAmount;

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
