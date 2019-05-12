package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.USES_DEVICE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.UsesDevice;

@ExternalDomain
public class UsesDeviceConverter implements DomainConverter<UsesDevice, String> {

	@Override
	public String fromDomainToValue(UsesDevice domain) {
		return domain.getNativeValue();
	}

	@Override
	public UsesDevice fromValueToDomain(String value) {
		return new USES_DEVICE(value);
	}

}
