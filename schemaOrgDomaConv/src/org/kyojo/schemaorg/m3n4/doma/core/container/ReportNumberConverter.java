package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REPORT_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.ReportNumber;

@ExternalDomain
public class ReportNumberConverter implements DomainConverter<ReportNumber, String> {

	@Override
	public String fromDomainToValue(ReportNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReportNumber fromValueToDomain(String value) {
		return new REPORT_NUMBER(value);
	}

}
