package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SCHOOL;
import org.kyojo.schemaorg.m3n5.core.Clazz.School;

@ExternalDomain
public class SchoolConverter implements DomainConverter<School, String> {

	@Override
	public String fromDomainToValue(School domain) {
		return domain.getNativeValue();
	}

	@Override
	public School fromValueToDomain(String value) {
		return new SCHOOL(value);
	}

}
