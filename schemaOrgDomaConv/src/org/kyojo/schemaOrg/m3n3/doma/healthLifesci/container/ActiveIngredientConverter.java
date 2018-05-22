package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ACTIVE_INGREDIENT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ActiveIngredient;

@ExternalDomain
public class ActiveIngredientConverter implements DomainConverter<ActiveIngredient, String> {

	@Override
	public String fromDomainToValue(ActiveIngredient domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActiveIngredient fromValueToDomain(String value) {
		return new ACTIVE_INGREDIENT(value);
	}

}
