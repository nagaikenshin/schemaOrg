package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MIDDLE_SCHOOL;
import org.kyojo.schemaorg.m3n4.core.Clazz.MiddleSchool;

@ExternalDomain
public class MiddleSchoolConverter implements DomainConverter<MiddleSchool, String> {

	@Override
	public String fromDomainToValue(MiddleSchool domain) {
		return domain.getNativeValue();
	}

	@Override
	public MiddleSchool fromValueToDomain(String value) {
		return new MIDDLE_SCHOOL(value);
	}

}
