package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_GUIDELINE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalGuideline;

@ExternalDomain
public class MedicalGuidelineConverter implements DomainConverter<MedicalGuideline, String> {

	@Override
	public String fromDomainToValue(MedicalGuideline domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalGuideline fromValueToDomain(String value) {
		return new MEDICAL_GUIDELINE(value);
	}

}