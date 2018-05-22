package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.PODIATRIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Podiatric;

@ExternalDomain
public class PodiatricConverter implements DomainConverter<Podiatric, String> {

	@Override
	public String fromDomainToValue(Podiatric domain) {
		return domain.getNativeValue();
	}

	@Override
	public Podiatric fromValueToDomain(String value) {
		return new PODIATRIC(value);
	}

}
