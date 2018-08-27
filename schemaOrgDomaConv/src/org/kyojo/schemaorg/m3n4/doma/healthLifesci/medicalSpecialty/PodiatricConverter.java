package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.PODIATRIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Podiatric;

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
