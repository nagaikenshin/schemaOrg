package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ORIGIN_ADDRESS;
import org.kyojo.schemaorg.m3n4.core.Container.OriginAddress;

@ExternalDomain
public class OriginAddressConverter implements DomainConverter<OriginAddress, String> {

	@Override
	public String fromDomainToValue(OriginAddress domain) {
		return domain.getNativeValue();
	}

	@Override
	public OriginAddress fromValueToDomain(String value) {
		return new ORIGIN_ADDRESS(value);
	}

}
