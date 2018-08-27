package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EXERCISE_GYM;
import org.kyojo.schemaorg.m3n4.core.Clazz.ExerciseGym;

@ExternalDomain
public class ExerciseGymConverter implements DomainConverter<ExerciseGym, String> {

	@Override
	public String fromDomainToValue(ExerciseGym domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExerciseGym fromValueToDomain(String value) {
		return new EXERCISE_GYM(value);
	}

}
