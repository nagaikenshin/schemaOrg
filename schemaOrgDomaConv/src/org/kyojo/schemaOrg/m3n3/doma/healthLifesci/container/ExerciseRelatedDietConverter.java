package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.EXERCISE_RELATED_DIET;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExerciseRelatedDiet;

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
