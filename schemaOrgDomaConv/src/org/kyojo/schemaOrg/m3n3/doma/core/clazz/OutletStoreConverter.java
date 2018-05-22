package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OUTLET_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OutletStore;

@ExternalDomain
public class OutletStoreConverter implements DomainConverter<OutletStore, String> {

	@Override
	public String fromDomainToValue(OutletStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public OutletStore fromValueToDomain(String value) {
		return new OUTLET_STORE(value);
	}

}
