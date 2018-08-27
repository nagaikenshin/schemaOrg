package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EXPECTED_ARRIVAL_FROM;
import org.kyojo.schemaorg.m3n4.core.Container.ExpectedArrivalFrom;

@ExternalDomain
public class ExpectedArrivalFromConverter implements DomainConverter<ExpectedArrivalFrom, Date> {

	@Override
	public Date fromDomainToValue(ExpectedArrivalFrom domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExpectedArrivalFrom fromValueToDomain(Date value) {
		return new EXPECTED_ARRIVAL_FROM(value);
	}

}
