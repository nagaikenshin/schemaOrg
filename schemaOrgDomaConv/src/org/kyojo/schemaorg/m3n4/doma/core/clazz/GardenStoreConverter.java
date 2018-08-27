package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GARDEN_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.GardenStore;

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
