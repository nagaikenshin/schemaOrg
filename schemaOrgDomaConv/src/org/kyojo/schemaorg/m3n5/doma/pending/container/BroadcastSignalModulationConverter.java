package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.BROADCAST_SIGNAL_MODULATION;
import org.kyojo.schemaorg.m3n5.pending.Container.BroadcastSignalModulation;

@ExternalDomain
public class BroadcastSignalModulationConverter implements DomainConverter<BroadcastSignalModulation, String> {

	@Override
	public String fromDomainToValue(BroadcastSignalModulation domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastSignalModulation fromValueToDomain(String value) {
		return new BROADCAST_SIGNAL_MODULATION(value);
	}

}
