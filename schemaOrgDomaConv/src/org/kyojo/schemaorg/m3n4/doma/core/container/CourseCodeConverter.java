package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COURSE_CODE;
import org.kyojo.schemaorg.m3n4.core.Container.CourseCode;

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
