package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PRINT_SECTION;
import org.kyojo.schemaorg.m3n4.core.Container.PrintSection;

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
