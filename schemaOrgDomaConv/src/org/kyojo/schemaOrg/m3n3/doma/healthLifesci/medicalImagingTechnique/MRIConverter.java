package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalImagingTechnique.MRI;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalImagingTechnique;

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
