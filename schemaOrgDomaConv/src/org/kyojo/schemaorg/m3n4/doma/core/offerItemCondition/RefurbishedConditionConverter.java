package org.kyojo.schemaorg.m3n4.doma.core.offerItemCondition;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.offerItemCondition.REFURBISHED_CONDITION;
import org.kyojo.schemaorg.m3n4.core.OfferItemCondition.RefurbishedCondition;

@ExternalDomain
public class RefurbishedConditionConverter implements DomainConverter<RefurbishedCondition, String> {

	@Override
	public String fromDomainToValue(RefurbishedCondition domain) {
		return domain.getNativeValue();
	}

	@Override
	public RefurbishedCondition fromValueToDomain(String value) {
		return new REFURBISHED_CONDITION(value);
	}

}
