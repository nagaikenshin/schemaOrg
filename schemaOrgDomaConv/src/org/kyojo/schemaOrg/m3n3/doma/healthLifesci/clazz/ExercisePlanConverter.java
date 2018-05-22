package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.EXERCISE_PLAN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.ExercisePlan;

@ExternalDomain
public class ExercisePlanConverter implements DomainConverter<ExercisePlan, String> {

	@Override
	public String fromDomainToValue(ExercisePlan domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExercisePlan fromValueToDomain(String value) {
		return new EXERCISE_PLAN(value);
	}

}
