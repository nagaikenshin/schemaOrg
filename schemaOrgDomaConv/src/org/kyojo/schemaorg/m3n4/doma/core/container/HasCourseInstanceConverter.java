package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HAS_COURSE_INSTANCE;
import org.kyojo.schemaorg.m3n4.core.Container.HasCourseInstance;

@ExternalDomain
public class HasCourseInstanceConverter implements DomainConverter<HasCourseInstance, String> {

	@Override
	public String fromDomainToValue(HasCourseInstance domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasCourseInstance fromValueToDomain(String value) {
		return new HAS_COURSE_INSTANCE(value);
	}

}
