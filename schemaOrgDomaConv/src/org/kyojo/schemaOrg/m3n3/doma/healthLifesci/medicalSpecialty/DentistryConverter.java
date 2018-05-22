package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.DENTISTRY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Dentistry;

@ExternalDomain
public class DentistryConverter implements DomainConverter<Dentistry, String> {

	@Override
	public String fromDomainToValue(Dentistry domain) {
		return domain.getNativeValue();
	}

	@Override
	public Dentistry fromValueToDomain(String value) {
		return new DENTISTRY(value);
	}

}
