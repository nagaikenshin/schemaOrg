package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.INFECTIOUS;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Infectious;

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