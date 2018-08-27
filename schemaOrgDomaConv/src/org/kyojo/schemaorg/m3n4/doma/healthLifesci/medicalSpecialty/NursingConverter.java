package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.NURSING;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Nursing;

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
