package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RECIPE_INSTRUCTIONS;
import org.kyojo.schemaorg.m3n4.core.Container.RecipeInstructions;

@ExternalDomain
public class RecipeInstructionsConverter implements DomainConverter<RecipeInstructions, String> {

	@Override
	public String fromDomainToValue(RecipeInstructions domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecipeInstructions fromValueToDomain(String value) {
		return new RECIPE_INSTRUCTIONS(value);
	}

}
