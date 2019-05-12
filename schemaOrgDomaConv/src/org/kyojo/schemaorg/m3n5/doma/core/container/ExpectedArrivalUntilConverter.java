package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EXPECTED_ARRIVAL_UNTIL;
import org.kyojo.schemaorg.m3n5.core.Container.ExpectedArrivalUntil;

@ExternalDomain
public class ExpectedArrivalUntilConverter implements DomainConverter<ExpectedArrivalUntil, Date> {

	@Override
	public Date fromDomainToValue(ExpectedArrivalUntil domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExpectedArrivalUntil fromValueToDomain(Date value) {
		return new EXPECTED_ARRIVAL_UNTIL(value);
	}

}
