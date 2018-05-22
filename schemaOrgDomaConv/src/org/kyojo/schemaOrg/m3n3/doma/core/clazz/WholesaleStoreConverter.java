package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WHOLESALE_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WholesaleStore;

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
