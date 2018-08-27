package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HARDWARE_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.HardwareStore;

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
