package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.EXERCISE_PLAN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.ExercisePlan;

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
