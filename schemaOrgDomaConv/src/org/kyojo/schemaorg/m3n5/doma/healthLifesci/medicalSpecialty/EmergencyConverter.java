package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.EMERGENCY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Emergency;

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
