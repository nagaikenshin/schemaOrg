package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalObservationalStudyDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalObservationalStudyDesign.REGISTRY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalObservationalStudyDesign.Registry;

@ExternalDomain
public class RegistryConverter implements DomainConverter<Registry, String> {

	@Override
	public String fromDomainToValue(Registry domain) {
		return domain.getNativeValue();
	}

	@Override
	public Registry fromValueToDomain(String value) {
		return new REGISTRY(value);
	}

}
