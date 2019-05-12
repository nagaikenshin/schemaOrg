package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.HEALTH_CONDITION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.HealthCondition;

@ExternalDomain
public class HealthConditionConverter implements DomainConverter<HealthCondition, String> {

	@Override
	public String fromDomainToValue(HealthCondition domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthCondition fromValueToDomain(String value) {
		return new HEALTH_CONDITION(value);
	}

}
