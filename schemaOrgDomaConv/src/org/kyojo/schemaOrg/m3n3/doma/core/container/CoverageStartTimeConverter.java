package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COVERAGE_START_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.CoverageStartTime;

@ExternalDomain
public class CoverageStartTimeConverter implements DomainConverter<CoverageStartTime, Date> {

	@Override
	public Date fromDomainToValue(CoverageStartTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public CoverageStartTime fromValueToDomain(Date value) {
		return new COVERAGE_START_TIME(value);
	}

}
