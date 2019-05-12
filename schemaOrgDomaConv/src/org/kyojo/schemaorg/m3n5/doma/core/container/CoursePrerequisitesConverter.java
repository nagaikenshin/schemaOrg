package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COURSE_PREREQUISITES;
import org.kyojo.schemaorg.m3n5.core.Container.CoursePrerequisites;

@ExternalDomain
public class CoursePrerequisitesConverter implements DomainConverter<CoursePrerequisites, String> {

	@Override
	public String fromDomainToValue(CoursePrerequisites domain) {
		return domain.getNativeValue();
	}

	@Override
	public CoursePrerequisites fromValueToDomain(String value) {
		return new COURSE_PREREQUISITES(value);
	}

}
