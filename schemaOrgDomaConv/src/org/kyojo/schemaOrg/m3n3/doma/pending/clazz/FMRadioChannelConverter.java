package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.FM_RADIO_CHANNEL;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.FMRadioChannel;

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
