package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.REPAYMENT_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.RepaymentSpecification;

@ExternalDomain
public class RepaymentSpecificationConverter implements DomainConverter<RepaymentSpecification, String> {

	@Override
	public String fromDomainToValue(RepaymentSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public RepaymentSpecification fromValueToDomain(String value) {
		return new REPAYMENT_SPECIFICATION(value);
	}

}
