package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.PEDIATRIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Pediatric;

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
