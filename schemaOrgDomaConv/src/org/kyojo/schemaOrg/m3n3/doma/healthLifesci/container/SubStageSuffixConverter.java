package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.SUB_STAGE_SUFFIX;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SubStageSuffix;

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
