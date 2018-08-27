package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HONORIFIC_PREFIX;
import org.kyojo.schemaorg.m3n4.core.Container.HonorificPrefix;

@ExternalDomain
public class HonorificPrefixConverter implements DomainConverter<HonorificPrefix, String> {

	@Override
	public String fromDomainToValue(HonorificPrefix domain) {
		return domain.getNativeValue();
	}

	@Override
	public HonorificPrefix fromValueToDomain(String value) {
		return new HONORIFIC_PREFIX(value);
	}

}
