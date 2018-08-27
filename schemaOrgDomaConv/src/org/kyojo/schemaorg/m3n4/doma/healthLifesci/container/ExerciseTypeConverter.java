package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.EXERCISE_TYPE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExerciseType;

@ExternalDomain
public class ExerciseTypeConverter implements DomainConverter<ExerciseType, String> {

	@Override
	public String fromDomainToValue(ExerciseType domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExerciseType fromValueToDomain(String value) {
		return new EXERCISE_TYPE(value);
	}

}