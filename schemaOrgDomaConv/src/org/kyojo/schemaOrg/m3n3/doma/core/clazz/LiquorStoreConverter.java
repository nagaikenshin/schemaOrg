package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LIQUOR_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LiquorStore;

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
