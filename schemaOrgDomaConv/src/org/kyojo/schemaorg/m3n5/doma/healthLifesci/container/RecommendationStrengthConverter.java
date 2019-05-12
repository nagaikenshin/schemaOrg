package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.RECOMMENDATION_STRENGTH;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.RecommendationStrength;

@ExternalDomain
public class RecommendationStrengthConverter implements DomainConverter<RecommendationStrength, String> {

	@Override
	public String fromDomainToValue(RecommendationStrength domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecommendationStrength fromValueToDomain(String value) {
		return new RECOMMENDATION_STRENGTH(value);
	}

}
