package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUTO_PARTS_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AutoPartsStore;

@ExternalDomain
public class AutoPartsStoreConverter implements DomainConverter<AutoPartsStore, String> {

	@Override
	public String fromDomainToValue(AutoPartsStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public AutoPartsStore fromValueToDomain(String value) {
		return new AUTO_PARTS_STORE(value);
	}

}
