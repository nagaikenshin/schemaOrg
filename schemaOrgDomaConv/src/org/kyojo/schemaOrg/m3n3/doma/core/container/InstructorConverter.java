package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INSTRUCTOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Instructor;

@ExternalDomain
public class InstructorConverter implements DomainConverter<Instructor, String> {

	@Override
	public String fromDomainToValue(Instructor domain) {
		return domain.getNativeValue();
	}

	@Override
	public Instructor fromValueToDomain(String value) {
		return new INSTRUCTOR(value);
	}

}
