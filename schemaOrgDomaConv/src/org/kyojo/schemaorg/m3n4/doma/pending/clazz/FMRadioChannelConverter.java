package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.FM_RADIO_CHANNEL;
import org.kyojo.schemaorg.m3n4.pending.Clazz.FMRadioChannel;

@ExternalDomain
public class FMRadioChannelConverter implements DomainConverter<FMRadioChannel, String> {

	@Override
	public String fromDomainToValue(FMRadioChannel domain) {
		return domain.getNativeValue();
	}

	@Override
	public FMRadioChannel fromValueToDomain(String value) {
		return new FM_RADIO_CHANNEL(value);
	}

}
