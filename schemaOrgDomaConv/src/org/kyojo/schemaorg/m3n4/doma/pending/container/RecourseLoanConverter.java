package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.RECOURSE_LOAN;
import org.kyojo.schemaorg.m3n4.pending.Container.RecourseLoan;

@ExternalDomain
public class RecourseLoanConverter implements DomainConverter<RecourseLoan, Boolean> {

	@Override
	public Boolean fromDomainToValue(RecourseLoan domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecourseLoan fromValueToDomain(Boolean value) {
		return new RECOURSE_LOAN(value);
	}

}
