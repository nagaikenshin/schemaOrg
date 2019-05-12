package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BRIDGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Bridge;

@ExternalDomain
public class BridgeConverter implements DomainConverter<Bridge, String> {

	@Override
	public String fromDomainToValue(Bridge domain) {
		return domain.getNativeValue();
	}

	@Override
	public Bridge fromValueToDomain(String value) {
		return new BRIDGE(value);
	}

}
