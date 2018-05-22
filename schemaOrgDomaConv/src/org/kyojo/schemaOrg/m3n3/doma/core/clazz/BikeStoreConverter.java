package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BIKE_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BikeStore;

@ExternalDomain
public class BikeStoreConverter implements DomainConverter<BikeStore, String> {

	@Override
	public String fromDomainToValue(BikeStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public BikeStore fromValueToDomain(String value) {
		return new BIKE_STORE(value);
	}

}
