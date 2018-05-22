package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PRE_OP;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PreOp;

@ExternalDomain
public class PreOpConverter implements DomainConverter<PreOp, String> {

	@Override
	public String fromDomainToValue(PreOp domain) {
		return domain.getNativeValue();
	}

	@Override
	public PreOp fromValueToDomain(String value) {
		return new PRE_OP(value);
	}

}
