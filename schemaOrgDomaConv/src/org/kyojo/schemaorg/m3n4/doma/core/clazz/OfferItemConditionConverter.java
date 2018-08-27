package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OFFER_ITEM_CONDITION;
import org.kyojo.schemaorg.m3n4.core.Clazz.OfferItemCondition;

@ExternalDomain
public class OfferItemConditionConverter implements DomainConverter<OfferItemCondition, String> {

	@Override
	public String fromDomainToValue(OfferItemCondition domain) {
		return domain.getNativeValue();
	}

	@Override
	public OfferItemCondition fromValueToDomain(String value) {
		return new OFFER_ITEM_CONDITION(value);
	}

}
