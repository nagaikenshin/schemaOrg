package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.RENEGOTIABLE_LOAN;
import org.kyojo.schemaorg.m3n5.pending.Container.RenegotiableLoan;

@ExternalDomain
public class RenegotiableLoanConverter implements DomainConverter<RenegotiableLoan, Boolean> {

	@Override
	public Boolean fromDomainToValue(RenegotiableLoan domain) {
		return domain.getNativeValue();
	}

	@Override
	public RenegotiableLoan fromValueToDomain(Boolean value) {
		return new RENEGOTIABLE_LOAN(value);
	}

}
