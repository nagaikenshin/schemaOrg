package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ELECTRONICS_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ElectronicsStore;

@ExternalDomain
public class ElectronicsStoreConverter implements DomainConverter<ElectronicsStore, String> {

	@Override
	public String fromDomainToValue(ElectronicsStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public ElectronicsStore fromValueToDomain(String value) {
		return new ELECTRONICS_STORE(value);
	}

}
