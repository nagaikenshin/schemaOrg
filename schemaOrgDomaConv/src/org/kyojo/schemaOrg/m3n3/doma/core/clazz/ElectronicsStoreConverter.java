package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ELECTRONICS_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ElectronicsStore;

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
