package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SHOE_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShoeStore;

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
