package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AUTO_PARTS_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoPartsStore;

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
