package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalImagingTechnique.CT;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalImagingTechnique;

@ExternalDomain
public class CTConverter implements DomainConverter<MedicalImagingTechnique.CT, String> {

	@Override
	public String fromDomainToValue(MedicalImagingTechnique.CT domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalImagingTechnique.CT fromValueToDomain(String value) {
		return new CT(value);
	}

}