package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SUB_STAGE_SUFFIX;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SubStageSuffix;

@ExternalDomain
public class SubStageSuffixConverter implements DomainConverter<SubStageSuffix, String> {

	@Override
	public String fromDomainToValue(SubStageSuffix domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubStageSuffix fromValueToDomain(String value) {
		return new SUB_STAGE_SUFFIX(value);
	}

}
