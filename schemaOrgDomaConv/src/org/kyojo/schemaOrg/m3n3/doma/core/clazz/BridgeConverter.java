package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BRIDGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Bridge;

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
