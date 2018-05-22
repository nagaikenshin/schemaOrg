package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RECIPE_INSTRUCTIONS;
import org.kyojo.schemaOrg.m3n3.core.Container.RecipeInstructions;

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
