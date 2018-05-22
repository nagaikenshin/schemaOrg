package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OFFER_ITEM_CONDITION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OfferItemCondition;

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
