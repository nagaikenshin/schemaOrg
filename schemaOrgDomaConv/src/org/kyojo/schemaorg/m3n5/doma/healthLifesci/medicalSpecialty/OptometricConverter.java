package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.OPTOMETRIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Optometric;

@ExternalDomain
public class OptometricConverter implements DomainConverter<Optometric, String> {

	@Override
	public String fromDomainToValue(Optometric domain) {
		return domain.getNativeValue();
	}

	@Override
	public Optometric fromValueToDomain(String value) {
		return new OPTOMETRIC(value);
	}

}