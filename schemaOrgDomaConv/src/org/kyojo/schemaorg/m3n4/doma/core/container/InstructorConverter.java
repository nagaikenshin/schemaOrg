package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INSTRUCTOR;
import org.kyojo.schemaorg.m3n4.core.Container.Instructor;

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
