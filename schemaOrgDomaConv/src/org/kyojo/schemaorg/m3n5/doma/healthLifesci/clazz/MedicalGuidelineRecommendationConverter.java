package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_GUIDELINE_RECOMMENDATION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalGuidelineRecommendation;

@ExternalDomain
public class MedicalGuidelineRecommendationConverter implements DomainConverter<MedicalGuidelineRecommendation, String> {

	@Override
	public String fromDomainToValue(MedicalGuidelineRecommendation domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalGuidelineRecommendation fromValueToDomain(String value) {
		return new MEDICAL_GUIDELINE_RECOMMENDATION(value);
	}

}
