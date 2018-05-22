package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.CARDIOVASCULAR;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Cardiovascular;

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
