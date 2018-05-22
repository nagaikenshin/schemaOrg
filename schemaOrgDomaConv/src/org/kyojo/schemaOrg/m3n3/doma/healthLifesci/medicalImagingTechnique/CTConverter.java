package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalImagingTechnique.CT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalImagingTechnique;

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
