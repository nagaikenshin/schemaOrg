package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.BROADCAST_FREQUENCY;
import org.kyojo.schemaorg.m3n4.pending.Container.BroadcastFrequency;

@ExternalDomain
public class BroadcastFrequencyConverter implements DomainConverter<BroadcastFrequency, String> {

	@Override
	public String fromDomainToValue(BroadcastFrequency domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastFrequency fromValueToDomain(String value) {
		return new BROADCAST_FREQUENCY(value);
	}

}
