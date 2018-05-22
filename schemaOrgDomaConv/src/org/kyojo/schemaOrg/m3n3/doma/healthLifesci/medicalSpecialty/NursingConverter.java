package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.NURSING;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Nursing;

@ExternalDomain
public class NursingConverter implements DomainConverter<Nursing, String> {

	@Override
	public String fromDomainToValue(Nursing domain) {
		return domain.getNativeValue();
	}

	@Override
	public Nursing fromValueToDomain(String value) {
		return new NURSING(value);
	}

}
