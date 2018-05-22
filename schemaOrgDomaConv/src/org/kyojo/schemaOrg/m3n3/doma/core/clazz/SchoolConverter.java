package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SCHOOL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.School;

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
