package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CLOTHING_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ClothingStore;

@ExternalDomain
public class ClothingStoreConverter implements DomainConverter<ClothingStore, String> {

	@Override
	public String fromDomainToValue(ClothingStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public ClothingStore fromValueToDomain(String value) {
		return new CLOTHING_STORE(value);
	}

}
