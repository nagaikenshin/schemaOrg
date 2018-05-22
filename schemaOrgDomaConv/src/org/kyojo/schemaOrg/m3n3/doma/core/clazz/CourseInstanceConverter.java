package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COURSE_INSTANCE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CourseInstance;

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
