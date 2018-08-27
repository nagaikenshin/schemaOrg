package org.kyojo.schemaorg.m3n4.doma.core.offerItemCondition;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.offerItemCondition.DAMAGED_CONDITION;
import org.kyojo.schemaorg.m3n4.core.OfferItemCondition.DamagedCondition;

@ExternalDomain
public class DamagedConditionConverter implements DomainConverter<DamagedCondition, String> {

	@Override
	public String fromDomainToValue(DamagedCondition domain) {
		return domain.getNativeValue();
	}

	@Override
	public DamagedCondition fromValueToDomain(String value) {
		return new DAMAGED_CONDITION(value);
	}

}
