package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INSURANCE_AGENCY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.InsuranceAgency;

@ExternalDomain
public class InsuranceAgencyConverter implements DomainConverter<InsuranceAgency, String> {

	@Override
	public String fromDomainToValue(InsuranceAgency domain) {
		return domain.getNativeValue();
	}

	@Override
	public InsuranceAgency fromValueToDomain(String value) {
		return new INSURANCE_AGENCY(value);
	}

}
