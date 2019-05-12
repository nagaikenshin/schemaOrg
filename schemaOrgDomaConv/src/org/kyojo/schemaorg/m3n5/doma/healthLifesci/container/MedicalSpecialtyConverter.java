package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_SPECIALTY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.MedicalSpecialty;

@ExternalDomain
public class MedicalSpecialtyConverter implements DomainConverter<MedicalSpecialty, String> {

	@Override
	public String fromDomainToValue(MedicalSpecialty domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalSpecialty fromValueToDomain(String value) {
		return new MEDICAL_SPECIALTY(value);
	}

}