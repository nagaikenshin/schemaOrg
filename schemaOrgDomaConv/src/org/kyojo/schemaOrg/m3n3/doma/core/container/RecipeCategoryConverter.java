package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RECIPE_CATEGORY;
import org.kyojo.schemaOrg.m3n3.core.Container.RecipeCategory;

@ExternalDomain
public class RecipeCategoryConverter implements DomainConverter<RecipeCategory, String> {

	@Override
	public String fromDomainToValue(RecipeCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecipeCategory fromValueToDomain(String value) {
		return new RECIPE_CATEGORY(value);
	}

}
