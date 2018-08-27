package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OUTLET_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.OutletStore;

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
