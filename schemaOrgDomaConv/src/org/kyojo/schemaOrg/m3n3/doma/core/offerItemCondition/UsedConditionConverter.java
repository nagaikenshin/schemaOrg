package org.kyojo.schemaOrg.m3n3.doma.core.offerItemCondition;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.offerItemCondition.USED_CONDITION;
import org.kyojo.schemaOrg.m3n3.core.OfferItemCondition.UsedCondition;

@ExternalDomain
public class UsedConditionConverter implements DomainConverter<UsedCondition, String> {

	@Override
	public String fromDomainToValue(UsedCondition domain) {
		return domain.getNativeValue();
	}

	@Override
	public UsedCondition fromValueToDomain(String value) {
		return new USED_CONDITION(value);
	}

}
