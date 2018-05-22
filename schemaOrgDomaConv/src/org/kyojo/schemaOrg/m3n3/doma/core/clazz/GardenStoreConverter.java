package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GARDEN_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GardenStore;

@ExternalDomain
public class GardenStoreConverter implements DomainConverter<GardenStore, String> {

	@Override
	public String fromDomainToValue(GardenStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public GardenStore fromValueToDomain(String value) {
		return new GARDEN_STORE(value);
	}

}
