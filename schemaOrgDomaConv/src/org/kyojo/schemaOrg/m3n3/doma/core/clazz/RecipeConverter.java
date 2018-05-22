package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RECIPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Recipe;

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
