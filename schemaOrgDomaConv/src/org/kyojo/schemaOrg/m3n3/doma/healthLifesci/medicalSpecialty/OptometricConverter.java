package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.OPTOMETRIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Optometric;

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
