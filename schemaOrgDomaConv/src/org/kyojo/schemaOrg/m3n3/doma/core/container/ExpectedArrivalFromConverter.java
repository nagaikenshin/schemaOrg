package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EXPECTED_ARRIVAL_FROM;
import org.kyojo.schemaOrg.m3n3.core.Container.ExpectedArrivalFrom;

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
