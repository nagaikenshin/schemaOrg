package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BITRATE;
import org.kyojo.schemaorg.m3n5.core.Container.Bitrate;

@ExternalDomain
public class BitrateConverter implements DomainConverter<Bitrate, String> {

	@Override
	public String fromDomainToValue(Bitrate domain) {
		return domain.getNativeValue();
	}

	@Override
	public Bitrate fromValueToDomain(String value) {
		return new BITRATE(value);
	}

}
