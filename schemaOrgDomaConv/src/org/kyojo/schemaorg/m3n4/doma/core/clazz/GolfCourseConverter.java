package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GOLF_COURSE;
import org.kyojo.schemaorg.m3n4.core.Clazz.GolfCourse;

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