package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.EMERGENCY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Emergency;

@ExternalDomain
public class EmergencyConverter implements DomainConverter<Emergency, String> {

	@Override
	public String fromDomainToValue(Emergency domain) {
		return domain.getNativeValue();
	}

	@Override
	public Emergency fromValueToDomain(String value) {
		return new EMERGENCY(value);
	}

}
