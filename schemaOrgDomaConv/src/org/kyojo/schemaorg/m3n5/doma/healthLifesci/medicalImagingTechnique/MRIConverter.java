package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalImagingTechnique.MRI;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalImagingTechnique;

@ExternalDomain
public class MRIConverter implements DomainConverter<MedicalImagingTechnique.MRI, String> {

	@Override
	public String fromDomainToValue(MedicalImagingTechnique.MRI domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalImagingTechnique.MRI fromValueToDomain(String value) {
		return new MRI(value);
	}

}