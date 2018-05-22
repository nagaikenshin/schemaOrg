package org.kyojo.schemaOrg.m3n3.doma.core.offerItemCondition;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.offerItemCondition.NEW_CONDITION;
import org.kyojo.schemaOrg.m3n3.core.OfferItemCondition.NewCondition;

@ExternalDomain
public class NewConditionConverter implements DomainConverter<NewCondition, String> {

	@Override
	public String fromDomainToValue(NewCondition domain) {
		return domain.getNativeValue();
	}

	@Override
	public NewCondition fromValueToDomain(String value) {
		return new NEW_CONDITION(value);
	}

}
