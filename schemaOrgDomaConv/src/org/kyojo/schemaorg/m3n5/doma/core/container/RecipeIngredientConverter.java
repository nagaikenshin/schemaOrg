package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RECIPE_INGREDIENT;
import org.kyojo.schemaorg.m3n5.core.Container.RecipeIngredient;

@ExternalDomain
public class RecipeIngredientConverter implements DomainConverter<RecipeIngredient, String> {

	@Override
	public String fromDomainToValue(RecipeIngredient domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecipeIngredient fromValueToDomain(String value) {
		return new RECIPE_INGREDIENT(value);
	}

}
