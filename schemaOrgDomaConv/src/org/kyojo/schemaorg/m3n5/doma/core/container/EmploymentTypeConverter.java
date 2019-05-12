package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EMPLOYMENT_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.EmploymentType;

@ExternalDomain
public class EmploymentTypeConverter implements DomainConverter<EmploymentType, String> {

	@Override
	public String fromDomainToValue(EmploymentType domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmploymentType fromValueToDomain(String value) {
		return new EMPLOYMENT_TYPE(value);
	}

}
