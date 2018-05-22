package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.SURGICAL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Surgical;

@ExternalDomain
public class SurgicalConverter implements DomainConverter<Surgical, String> {

	@Override
	public String fromDomainToValue(Surgical domain) {
		return domain.getNativeValue();
	}

	@Override
	public Surgical fromValueToDomain(String value) {
		return new SURGICAL(value);
	}

}
