package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EXERCISE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ExerciseAction;

@ExternalDomain
public class ExerciseActionConverter implements DomainConverter<ExerciseAction, String> {

	@Override
	public String fromDomainToValue(ExerciseAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExerciseAction fromValueToDomain(String value) {
		return new EXERCISE_ACTION(value);
	}

}
