package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TELEVISION_CHANNEL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TelevisionChannel;

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
