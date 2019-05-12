package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INSURANCE_AGENCY;
import org.kyojo.schemaorg.m3n5.core.Clazz.InsuranceAgency;

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
