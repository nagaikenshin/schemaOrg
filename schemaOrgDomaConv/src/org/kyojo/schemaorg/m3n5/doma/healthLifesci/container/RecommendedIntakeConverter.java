package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.RECOMMENDED_INTAKE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.RecommendedIntake;

@ExternalDomain
public class RecommendedIntakeConverter implements DomainConverter<RecommendedIntake, String> {

	@Override
	public String fromDomainToValue(RecommendedIntake domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecommendedIntake fromValueToDomain(String value) {
		return new RECOMMENDED_INTAKE(value);
	}

}
