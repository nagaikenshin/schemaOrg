package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GROCERY_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GroceryStore;

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
