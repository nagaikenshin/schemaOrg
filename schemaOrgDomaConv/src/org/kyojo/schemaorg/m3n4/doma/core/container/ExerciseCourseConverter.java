package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EXERCISE_COURSE;
import org.kyojo.schemaorg.m3n4.core.Container.ExerciseCourse;

@ExternalDomain
public class ExerciseCourseConverter implements DomainConverter<ExerciseCourse, String> {

	@Override
	public String fromDomainToValue(ExerciseCourse domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExerciseCourse fromValueToDomain(String value) {
		return new EXERCISE_COURSE(value);
	}

}
