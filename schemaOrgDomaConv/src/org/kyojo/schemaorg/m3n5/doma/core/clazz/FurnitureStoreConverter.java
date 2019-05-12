package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FURNITURE_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.FurnitureStore;

@ExternalDomain
public class FurnitureStoreConverter implements DomainConverter<FurnitureStore, String> {

	@Override
	public String fromDomainToValue(FurnitureStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public FurnitureStore fromValueToDomain(String value) {
		return new FURNITURE_STORE(value);
	}

}