package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.RADIO_BROADCAST_SERVICE;
import org.kyojo.schemaorg.m3n5.pending.Clazz.RadioBroadcastService;

@ExternalDomain
public class RadioBroadcastServiceConverter implements DomainConverter<RadioBroadcastService, String> {

	@Override
	public String fromDomainToValue(RadioBroadcastService domain) {
		return domain.getNativeValue();
	}

	@Override
	public RadioBroadcastService fromValueToDomain(String value) {
		return new RADIO_BROADCAST_SERVICE(value);
	}

}
