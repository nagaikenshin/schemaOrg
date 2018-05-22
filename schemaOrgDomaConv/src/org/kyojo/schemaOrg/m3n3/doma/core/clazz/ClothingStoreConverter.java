package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CLOTHING_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ClothingStore;

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
