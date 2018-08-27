package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.RADIOGRAPHY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Radiography;

@ExternalDomain
public class RadiographyConverter implements DomainConverter<Radiography, String> {

	@Override
	public String fromDomainToValue(Radiography domain) {
		return domain.getNativeValue();
	}

	@Override
	public Radiography fromValueToDomain(String value) {
		return new RADIOGRAPHY(value);
	}

}
