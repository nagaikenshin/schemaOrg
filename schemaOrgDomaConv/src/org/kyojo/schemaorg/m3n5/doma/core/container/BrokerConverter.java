package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BROKER;
import org.kyojo.schemaorg.m3n5.core.Container.Broker;

@ExternalDomain
public class BrokerConverter implements DomainConverter<Broker, String> {

	@Override
	public String fromDomainToValue(Broker domain) {
		return domain.getNativeValue();
	}

	@Override
	public Broker fromValueToDomain(String value) {
		return new BROKER(value);
	}

}
