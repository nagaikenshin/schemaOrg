package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.PRIMARY_CARE;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.PrimaryCare;

@ExternalDomain
public class PrimaryCareConverter implements DomainConverter<PrimaryCare, String> {

	@Override
	public String fromDomainToValue(PrimaryCare domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrimaryCare fromValueToDomain(String value) {
		return new PRIMARY_CARE(value);
	}

}