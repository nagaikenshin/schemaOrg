package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MENS_CLOTHING_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MensClothingStore;

@ExternalDomain
public class MensClothingStoreConverter implements DomainConverter<MensClothingStore, String> {

	@Override
	public String fromDomainToValue(MensClothingStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public MensClothingStore fromValueToDomain(String value) {
		return new MENS_CLOTHING_STORE(value);
	}

}
