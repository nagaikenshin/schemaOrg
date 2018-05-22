package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORIGIN_ADDRESS;
import org.kyojo.schemaOrg.m3n3.core.Container.OriginAddress;

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
