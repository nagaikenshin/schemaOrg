package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.OPERATING_SYSTEM;
import org.kyojo.schemaorg.m3n5.core.Container.OperatingSystem;

@ExternalDomain
public class OperatingSystemConverter implements DomainConverter<OperatingSystem, String> {

	@Override
	public String fromDomainToValue(OperatingSystem domain) {
		return domain.getNativeValue();
	}

	@Override
	public OperatingSystem fromValueToDomain(String value) {
		return new OPERATING_SYSTEM(value);
	}

}
