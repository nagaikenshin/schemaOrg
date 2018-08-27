package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LIQUOR_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiquorStore;

@ExternalDomain
public class LiquorStoreConverter implements DomainConverter<LiquorStore, String> {

	@Override
	public String fromDomainToValue(LiquorStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public LiquorStore fromValueToDomain(String value) {
		return new LIQUOR_STORE(value);
	}

}
