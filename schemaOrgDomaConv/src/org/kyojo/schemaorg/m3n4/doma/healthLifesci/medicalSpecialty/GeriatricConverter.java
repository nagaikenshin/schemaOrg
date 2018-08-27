package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.GERIATRIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Geriatric;

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
