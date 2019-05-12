package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.ONCOLOGIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Oncologic;

@ExternalDomain
public class OncologicConverter implements DomainConverter<Oncologic, String> {

	@Override
	public String fromDomainToValue(Oncologic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Oncologic fromValueToDomain(String value) {
		return new ONCOLOGIC(value);
	}

}
