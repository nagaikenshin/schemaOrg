package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PRE_OP;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PreOp;

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
