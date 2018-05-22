package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.GERIATRIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Geriatric;

@ExternalDomain
public class GeriatricConverter implements DomainConverter<Geriatric, String> {

	@Override
	public String fromDomainToValue(Geriatric domain) {
		return domain.getNativeValue();
	}

	@Override
	public Geriatric fromValueToDomain(String value) {
		return new GERIATRIC(value);
	}

}
