package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EXERCISE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ExerciseAction;

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
