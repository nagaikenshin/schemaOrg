package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REPORT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Report;

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
