package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RECIPE_YIELD;
import org.kyojo.schemaorg.m3n4.core.Container.RecipeYield;

@ExternalDomain
public class RecipeYieldConverter implements DomainConverter<RecipeYield, String> {

	@Override
	public String fromDomainToValue(RecipeYield domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecipeYield fromValueToDomain(String value) {
		return new RECIPE_YIELD(value);
	}

}
