package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NET_WORTH;
import org.kyojo.schemaorg.m3n4.core.Container.NetWorth;

@ExternalDomain
public class NetWorthConverter implements DomainConverter<NetWorth, String> {

	@Override
	public String fromDomainToValue(NetWorth domain) {
		return domain.getNativeValue();
	}

	@Override
	public NetWorth fromValueToDomain(String value) {
		return new NET_WORTH(value);
	}

}
