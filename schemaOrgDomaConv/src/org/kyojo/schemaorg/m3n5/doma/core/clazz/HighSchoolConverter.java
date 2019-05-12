package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HIGH_SCHOOL;
import org.kyojo.schemaorg.m3n5.core.Clazz.HighSchool;

@ExternalDomain
public class HighSchoolConverter implements DomainConverter<HighSchool, String> {

	@Override
	public String fromDomainToValue(HighSchool domain) {
		return domain.getNativeValue();
	}

	@Override
	public HighSchool fromValueToDomain(String value) {
		return new HIGH_SCHOOL(value);
	}

}
