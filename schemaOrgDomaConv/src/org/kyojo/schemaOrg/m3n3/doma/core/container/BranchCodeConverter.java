package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BRANCH_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.BranchCode;

@ExternalDomain
public class BranchCodeConverter implements DomainConverter<BranchCode, String> {

	@Override
	public String fromDomainToValue(BranchCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public BranchCode fromValueToDomain(String value) {
		return new BRANCH_CODE(value);
	}

}
