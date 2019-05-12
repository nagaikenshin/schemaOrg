package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.DENTISTRY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Dentistry;

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
