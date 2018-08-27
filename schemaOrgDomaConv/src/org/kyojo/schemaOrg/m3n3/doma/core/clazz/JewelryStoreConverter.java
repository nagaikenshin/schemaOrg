package org.kyojo.schemaorg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.core.impl.JEWELRY_STORE;
import org.kyojo.schemaorg.m3n3.core.Clazz.JewelryStore;

@ExternalDomain
public class JewelryStoreConverter implements DomainConverter<JewelryStore, String> {

	@Override
	public String fromDomainToValue(JewelryStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public JewelryStore fromValueToDomain(String value) {
		return new JEWELRY_STORE(value);
	}

}
