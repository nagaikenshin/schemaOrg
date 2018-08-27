package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.PHARMACY_SPECIALTY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.PharmacySpecialty;

@ExternalDomain
public class PharmacySpecialtyConverter implements DomainConverter<PharmacySpecialty, String> {

	@Override
	public String fromDomainToValue(PharmacySpecialty domain) {
		return domain.getNativeValue();
	}

	@Override
	public PharmacySpecialty fromValueToDomain(String value) {
		return new PHARMACY_SPECIALTY(value);
	}

}
