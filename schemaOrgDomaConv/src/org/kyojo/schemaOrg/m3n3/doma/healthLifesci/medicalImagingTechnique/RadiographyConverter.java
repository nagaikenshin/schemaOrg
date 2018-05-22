package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalImagingTechnique.RADIOGRAPHY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalImagingTechnique.Radiography;

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
