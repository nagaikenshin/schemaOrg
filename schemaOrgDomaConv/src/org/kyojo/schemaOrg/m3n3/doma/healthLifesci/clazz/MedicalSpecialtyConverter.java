package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_SPECIALTY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalSpecialty;

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
