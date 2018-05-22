package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.HEMATOLOGIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Hematologic;

@ExternalDomain
public class HematologicConverter implements DomainConverter<Hematologic, String> {

	@Override
	public String fromDomainToValue(Hematologic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Hematologic fromValueToDomain(String value) {
		return new HEMATOLOGIC(value);
	}

}
