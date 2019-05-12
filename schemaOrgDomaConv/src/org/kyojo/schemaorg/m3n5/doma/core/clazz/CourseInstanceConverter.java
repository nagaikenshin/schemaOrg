package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COURSE_INSTANCE;
import org.kyojo.schemaorg.m3n5.core.Clazz.CourseInstance;

@ExternalDomain
public class CourseInstanceConverter implements DomainConverter<CourseInstance, String> {

	@Override
	public String fromDomainToValue(CourseInstance domain) {
		return domain.getNativeValue();
	}

	@Override
	public CourseInstance fromValueToDomain(String value) {
		return new COURSE_INSTANCE(value);
	}

}