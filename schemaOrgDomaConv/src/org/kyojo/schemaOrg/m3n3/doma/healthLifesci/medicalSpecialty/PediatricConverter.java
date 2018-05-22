package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.PEDIATRIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Pediatric;

@ExternalDomain
public class PediatricConverter implements DomainConverter<Pediatric, String> {

	@Override
	public String fromDomainToValue(Pediatric domain) {
		return domain.getNativeValue();
	}

	@Override
	public Pediatric fromValueToDomain(String value) {
		return new PEDIATRIC(value);
	}

}
