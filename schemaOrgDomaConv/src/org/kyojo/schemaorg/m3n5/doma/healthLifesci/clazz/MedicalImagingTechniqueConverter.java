package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_IMAGING_TECHNIQUE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalImagingTechnique;

@ExternalDomain
public class MedicalImagingTechniqueConverter implements DomainConverter<MedicalImagingTechnique, String> {

	@Override
	public String fromDomainToValue(MedicalImagingTechnique domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalImagingTechnique fromValueToDomain(String value) {
		return new MEDICAL_IMAGING_TECHNIQUE(value);
	}

}
