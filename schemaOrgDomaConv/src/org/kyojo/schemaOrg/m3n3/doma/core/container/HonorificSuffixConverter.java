package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HONORIFIC_SUFFIX;
import org.kyojo.schemaOrg.m3n3.core.Container.HonorificSuffix;

@ExternalDomain
public class HonorificSuffixConverter implements DomainConverter<HonorificSuffix, String> {

	@Override
	public String fromDomainToValue(HonorificSuffix domain) {
		return domain.getNativeValue();
	}

	@Override
	public HonorificSuffix fromValueToDomain(String value) {
		return new HONORIFIC_SUFFIX(value);
	}

}
