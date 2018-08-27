package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EMPLOYMENT_AGENCY;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmploymentAgency;

@ExternalDomain
public class EmploymentAgencyConverter implements DomainConverter<EmploymentAgency, String> {

	@Override
	public String fromDomainToValue(EmploymentAgency domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmploymentAgency fromValueToDomain(String value) {
		return new EMPLOYMENT_AGENCY(value);
	}

}
