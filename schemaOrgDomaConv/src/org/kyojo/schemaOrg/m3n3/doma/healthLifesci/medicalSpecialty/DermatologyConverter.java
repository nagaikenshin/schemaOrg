package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.DERMATOLOGY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Dermatology;

@ExternalDomain
public class DermatologyConverter implements DomainConverter<Dermatology, String> {

	@Override
	public String fromDomainToValue(Dermatology domain) {
		return domain.getNativeValue();
	}

	@Override
	public Dermatology fromValueToDomain(String value) {
		return new DERMATOLOGY(value);
	}

}
