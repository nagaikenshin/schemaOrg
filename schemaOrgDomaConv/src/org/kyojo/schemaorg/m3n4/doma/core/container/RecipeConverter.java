package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RECIPE;
import org.kyojo.schemaorg.m3n4.core.Container.Recipe;

@ExternalDomain
public class RecipeConverter implements DomainConverter<Recipe, String> {

	@Override
	public String fromDomainToValue(Recipe domain) {
		return domain.getNativeValue();
	}

	@Override
	public Recipe fromValueToDomain(String value) {
		return new RECIPE(value);
	}

}
