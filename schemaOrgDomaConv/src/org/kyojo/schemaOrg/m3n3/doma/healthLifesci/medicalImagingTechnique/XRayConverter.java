package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalImagingTechnique;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalImagingTechnique.X_RAY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalImagingTechnique.XRay;

@ExternalDomain
public class XRayConverter implements DomainConverter<XRay, String> {

	@Override
	public String fromDomainToValue(XRay domain) {
		return domain.getNativeValue();
	}

	@Override
	public XRay fromValueToDomain(String value) {
		return new X_RAY(value);
	}

}
