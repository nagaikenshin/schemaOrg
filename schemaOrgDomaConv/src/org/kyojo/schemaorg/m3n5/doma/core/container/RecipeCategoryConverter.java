package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RECIPE_CATEGORY;
import org.kyojo.schemaorg.m3n5.core.Container.RecipeCategory;

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
