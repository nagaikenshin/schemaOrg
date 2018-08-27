package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COVERAGE_END_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.CoverageEndTime;

@ExternalDomain
public class CoverageEndTimeConverter implements DomainConverter<CoverageEndTime, Date> {

	@Override
	public Date fromDomainToValue(CoverageEndTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public CoverageEndTime fromValueToDomain(Date value) {
		return new COVERAGE_END_TIME(value);
	}

}
