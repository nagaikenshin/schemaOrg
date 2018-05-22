package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalImagingTechnique.PET;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalImagingTechnique;

@ExternalDomain
public class PETConverter implements DomainConverter<MedicalImagingTechnique.PET, String> {

	@Override
	public String fromDomainToValue(MedicalImagingTechnique.PET domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalImagingTechnique.PET fromValueToDomain(String value) {
		return new PET(value);
	}

}
