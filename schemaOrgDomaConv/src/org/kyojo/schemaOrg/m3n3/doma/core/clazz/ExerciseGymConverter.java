package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EXERCISE_GYM;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ExerciseGym;

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
