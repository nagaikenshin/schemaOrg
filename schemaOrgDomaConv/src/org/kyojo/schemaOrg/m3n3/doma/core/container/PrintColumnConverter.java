package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRINT_COLUMN;
import org.kyojo.schemaOrg.m3n3.core.Container.PrintColumn;

@ExternalDomain
public class PrintColumnConverter implements DomainConverter<PrintColumn, String> {

	@Override
	public String fromDomainToValue(PrintColumn domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrintColumn fromValueToDomain(String value) {
		return new PRINT_COLUMN(value);
	}

}
