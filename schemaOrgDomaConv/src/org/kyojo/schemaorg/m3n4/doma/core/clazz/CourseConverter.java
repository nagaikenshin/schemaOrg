package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COURSE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Course;

@ExternalDomain
public class CourseConverter implements DomainConverter<Course, String> {

	@Override
	public String fromDomainToValue(Course domain) {
		return domain.getNativeValue();
	}

	@Override
	public Course fromValueToDomain(String value) {
		return new COURSE(value);
	}

}