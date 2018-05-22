package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRINT_SECTION;
import org.kyojo.schemaOrg.m3n3.core.Container.PrintSection;

@ExternalDomain
public class PrintSectionConverter implements DomainConverter<PrintSection, String> {

	@Override
	public String fromDomainToValue(PrintSection domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrintSection fromValueToDomain(String value) {
		return new PRINT_SECTION(value);
	}

}
