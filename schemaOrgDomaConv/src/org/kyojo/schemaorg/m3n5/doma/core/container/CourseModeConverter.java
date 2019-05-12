package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COURSE_MODE;
import org.kyojo.schemaorg.m3n5.core.Container.CourseMode;

@ExternalDomain
public class CourseModeConverter implements DomainConverter<CourseMode, String> {

	@Override
	public String fromDomainToValue(CourseMode domain) {
		return domain.getNativeValue();
	}

	@Override
	public CourseMode fromValueToDomain(String value) {
		return new COURSE_MODE(value);
	}

}
