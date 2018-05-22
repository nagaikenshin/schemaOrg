package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RECIPE_CUISINE;
import org.kyojo.schemaOrg.m3n3.core.Container.RecipeCuisine;

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
