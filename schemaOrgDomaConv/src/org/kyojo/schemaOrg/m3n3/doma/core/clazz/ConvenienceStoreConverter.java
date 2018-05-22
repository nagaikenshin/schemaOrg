package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONVENIENCE_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ConvenienceStore;

@ExternalDomain
public class ConvenienceStoreConverter implements DomainConverter<ConvenienceStore, String> {

	@Override
	public String fromDomainToValue(ConvenienceStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public ConvenienceStore fromValueToDomain(String value) {
		return new CONVENIENCE_STORE(value);
	}

}
