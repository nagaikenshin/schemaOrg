package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SHOE_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ShoeStore;

@ExternalDomain
public class ShoeStoreConverter implements DomainConverter<ShoeStore, String> {

	@Override
	public String fromDomainToValue(ShoeStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public ShoeStore fromValueToDomain(String value) {
		return new SHOE_STORE(value);
	}

}
