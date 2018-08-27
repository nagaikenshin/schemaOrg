package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GROCERY_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.GroceryStore;

@ExternalDomain
public class GroceryStoreConverter implements DomainConverter<GroceryStore, String> {

	@Override
	public String fromDomainToValue(GroceryStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public GroceryStore fromValueToDomain(String value) {
		return new GROCERY_STORE(value);
	}

}
