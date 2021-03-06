package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.EXERCISE_RELATED_DIET;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExerciseRelatedDiet;

@ExternalDomain
public class ExerciseRelatedDietConverter implements DomainConverter<ExerciseRelatedDiet, String> {

	@Override
	public String fromDomainToValue(ExerciseRelatedDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExerciseRelatedDiet fromValueToDomain(String value) {
		return new EXERCISE_RELATED_DIET(value);
	}

}
