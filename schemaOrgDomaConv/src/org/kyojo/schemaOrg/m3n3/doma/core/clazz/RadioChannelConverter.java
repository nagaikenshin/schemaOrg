package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RADIO_CHANNEL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RadioChannel;

@ExternalDomain
public class RadioChannelConverter implements DomainConverter<RadioChannel, String> {

	@Override
	public String fromDomainToValue(RadioChannel domain) {
		return domain.getNativeValue();
	}

	@Override
	public RadioChannel fromValueToDomain(String value) {
		return new RADIO_CHANNEL(value);
	}

}
