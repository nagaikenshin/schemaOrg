package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HARDWARE_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HardwareStore;

@ExternalDomain
public class HardwareStoreConverter implements DomainConverter<HardwareStore, String> {

	@Override
	public String fromDomainToValue(HardwareStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public HardwareStore fromValueToDomain(String value) {
		return new HARDWARE_STORE(value);
	}

}
