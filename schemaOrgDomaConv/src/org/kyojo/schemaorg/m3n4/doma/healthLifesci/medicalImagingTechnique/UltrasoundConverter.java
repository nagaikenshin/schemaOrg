package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalImagingTechnique.ULTRASOUND;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalImagingTechnique.Ultrasound;

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