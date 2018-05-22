package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.GYNECOLOGIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Gynecologic;

@ExternalDomain
public class GynecologicConverter implements DomainConverter<Gynecologic, String> {

	@Override
	public String fromDomainToValue(Gynecologic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Gynecologic fromValueToDomain(String value) {
		return new GYNECOLOGIC(value);
	}

}
