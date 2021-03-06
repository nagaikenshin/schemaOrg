package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TELEVISION_CHANNEL;
import org.kyojo.schemaorg.m3n4.core.Clazz.TelevisionChannel;

@ExternalDomain
public class TelevisionChannelConverter implements DomainConverter<TelevisionChannel, String> {

	@Override
	public String fromDomainToValue(TelevisionChannel domain) {
		return domain.getNativeValue();
	}

	@Override
	public TelevisionChannel fromValueToDomain(String value) {
		return new TELEVISION_CHANNEL(value);
	}

}
