package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRINT_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.PrintPage;

@ExternalDomain
public class PrintPageConverter implements DomainConverter<PrintPage, String> {

	@Override
	public String fromDomainToValue(PrintPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrintPage fromValueToDomain(String value) {
		return new PRINT_PAGE(value);
	}

}
