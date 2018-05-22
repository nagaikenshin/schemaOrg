package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COURSE_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.CourseCode;

@ExternalDomain
public class CourseCodeConverter implements DomainConverter<CourseCode, String> {

	@Override
	public String fromDomainToValue(CourseCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public CourseCode fromValueToDomain(String value) {
		return new COURSE_CODE(value);
	}

}
