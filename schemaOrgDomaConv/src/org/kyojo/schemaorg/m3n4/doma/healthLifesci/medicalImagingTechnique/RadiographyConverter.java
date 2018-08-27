package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalImagingTechnique.RADIOGRAPHY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalImagingTechnique.Radiography;

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
