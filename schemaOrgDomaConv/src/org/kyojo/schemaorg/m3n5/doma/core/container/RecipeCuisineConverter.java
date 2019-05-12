package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RECIPE_CUISINE;
import org.kyojo.schemaorg.m3n5.core.Container.RecipeCuisine;

@ExternalDomain
public class RecipeCuisineConverter implements DomainConverter<RecipeCuisine, String> {

	@Override
	public String fromDomainToValue(RecipeCuisine domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecipeCuisine fromValueToDomain(String value) {
		return new RECIPE_CUISINE(value);
	}

}