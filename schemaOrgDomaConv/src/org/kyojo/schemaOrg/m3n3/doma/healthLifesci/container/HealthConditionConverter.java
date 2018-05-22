package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.HEALTH_CONDITION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HealthCondition;

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
