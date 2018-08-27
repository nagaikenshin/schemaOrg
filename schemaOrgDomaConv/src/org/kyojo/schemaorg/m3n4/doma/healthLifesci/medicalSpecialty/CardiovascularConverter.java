package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.CARDIOVASCULAR;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Cardiovascular;

@ExternalDomain
public class CardiovascularConverter implements DomainConverter<Cardiovascular, String> {

	@Override
	public String fromDomainToValue(Cardiovascular domain) {
		return domain.getNativeValue();
	}

	@Override
	public Cardiovascular fromValueToDomain(String value) {
		return new CARDIOVASCULAR(value);
	}

}