package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.ACTIVE_INGREDIENT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ActiveIngredient;

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
