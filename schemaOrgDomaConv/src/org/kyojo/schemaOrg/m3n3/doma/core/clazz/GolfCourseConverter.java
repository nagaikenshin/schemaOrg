package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GOLF_COURSE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GolfCourse;

@ExternalDomain
public class GolfCourseConverter implements DomainConverter<GolfCourse, String> {

	@Override
	public String fromDomainToValue(GolfCourse domain) {
		return domain.getNativeValue();
	}

	@Override
	public GolfCourse fromValueToDomain(String value) {
		return new GOLF_COURSE(value);
	}

}
