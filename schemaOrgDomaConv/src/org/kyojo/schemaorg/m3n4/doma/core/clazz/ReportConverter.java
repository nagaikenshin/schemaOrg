package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REPORT;
import org.kyojo.schemaorg.m3n4.core.Clazz.Report;

@ExternalDomain
public class ReportConverter implements DomainConverter<Report, String> {

	@Override
	public String fromDomainToValue(Report domain) {
		return domain.getNativeValue();
	}

	@Override
	public Report fromValueToDomain(String value) {
		return new REPORT(value);
	}

}
