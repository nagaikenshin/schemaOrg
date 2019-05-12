package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WHOLESALE_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.WholesaleStore;

@ExternalDomain
public class WholesaleStoreConverter implements DomainConverter<WholesaleStore, String> {

	@Override
	public String fromDomainToValue(WholesaleStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public WholesaleStore fromValueToDomain(String value) {
		return new WHOLESALE_STORE(value);
	}

}