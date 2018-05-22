package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COURSE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Course;

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
