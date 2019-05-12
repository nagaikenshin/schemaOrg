package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AVAILABLE_ON_DEVICE;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableOnDevice;

@ExternalDomain
public class AvailableOnDeviceConverter implements DomainConverter<AvailableOnDevice, String> {

	@Override
	public String fromDomainToValue(AvailableOnDevice domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableOnDevice fromValueToDomain(String value) {
		return new AVAILABLE_ON_DEVICE(value);
	}

}
