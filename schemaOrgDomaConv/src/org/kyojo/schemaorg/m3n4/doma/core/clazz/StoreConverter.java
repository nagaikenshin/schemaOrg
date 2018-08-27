package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Store;

@ExternalDomain
public class StoreConverter implements DomainConverter<Store, String> {

	@Override
	public String fromDomainToValue(Store domain) {
		return domain.getNativeValue();
	}

	@Override
	public Store fromValueToDomain(String value) {
		return new STORE(value);
	}

}
