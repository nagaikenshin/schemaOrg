package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PRINT_EDITION;
import org.kyojo.schemaorg.m3n4.core.Container.PrintEdition;

@ExternalDomain
public class PrintEditionConverter implements DomainConverter<PrintEdition, String> {

	@Override
	public String fromDomainToValue(PrintEdition domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrintEdition fromValueToDomain(String value) {
		return new PRINT_EDITION(value);
	}

}