package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BITRATE;
import org.kyojo.schemaOrg.m3n3.core.Container.Bitrate;

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
