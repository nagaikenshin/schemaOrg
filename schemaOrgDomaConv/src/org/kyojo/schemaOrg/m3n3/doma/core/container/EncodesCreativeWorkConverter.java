package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENCODES_CREATIVE_WORK;
import org.kyojo.schemaOrg.m3n3.core.Container.EncodesCreativeWork;

@ExternalDomain
public class EncodesCreativeWorkConverter implements DomainConverter<EncodesCreativeWork, String> {

	@Override
	public String fromDomainToValue(EncodesCreativeWork domain) {
		return domain.getNativeValue();
	}

	@Override
	public EncodesCreativeWork fromValueToDomain(String value) {
		return new ENCODES_CREATIVE_WORK(value);
	}

}
