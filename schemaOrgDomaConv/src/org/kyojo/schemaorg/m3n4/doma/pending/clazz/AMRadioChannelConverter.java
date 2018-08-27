package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.AM_RADIO_CHANNEL;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AMRadioChannel;

@ExternalDomain
public class AMRadioChannelConverter implements DomainConverter<AMRadioChannel, String> {

	@Override
	public String fromDomainToValue(AMRadioChannel domain) {
		return domain.getNativeValue();
	}

	@Override
	public AMRadioChannel fromValueToDomain(String value) {
		return new AM_RADIO_CHANNEL(value);
	}

}
