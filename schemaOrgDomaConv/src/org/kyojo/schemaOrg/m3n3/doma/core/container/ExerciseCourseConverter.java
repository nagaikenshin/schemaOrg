package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EXERCISE_COURSE;
import org.kyojo.schemaOrg.m3n3.core.Container.ExerciseCourse;

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
