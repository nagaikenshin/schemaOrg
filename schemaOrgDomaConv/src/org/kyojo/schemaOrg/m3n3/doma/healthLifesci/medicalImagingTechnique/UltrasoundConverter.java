package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalImagingTechnique.ULTRASOUND;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalImagingTechnique.Ultrasound;

@ExternalDomain
public class UltrasoundConverter implements DomainConverter<Ultrasound, String> {

	@Override
	public String fromDomainToValue(Ultrasound domain) {
		return domain.getNativeValue();
	}

	@Override
	public Ultrasound fromValueToDomain(String value) {
		return new ULTRASOUND(value);
	}

}
