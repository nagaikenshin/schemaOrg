package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.INFECTIOUS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Infectious;

@ExternalDomain
public class InfectiousConverter implements DomainConverter<Infectious, String> {

	@Override
	public String fromDomainToValue(Infectious domain) {
		return domain.getNativeValue();
	}

	@Override
	public Infectious fromValueToDomain(String value) {
		return new INFECTIOUS(value);
	}

}
