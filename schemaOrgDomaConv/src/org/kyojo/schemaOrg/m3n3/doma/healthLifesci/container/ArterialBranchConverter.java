package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ARTERIAL_BRANCH;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ArterialBranch;

@ExternalDomain
public class ArterialBranchConverter implements DomainConverter<ArterialBranch, String> {

	@Override
	public String fromDomainToValue(ArterialBranch domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArterialBranch fromValueToDomain(String value) {
		return new ARTERIAL_BRANCH(value);
	}

}
