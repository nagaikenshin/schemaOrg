package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PART_OF_INVOICE;
import org.kyojo.schemaorg.m3n5.core.Container.PartOfInvoice;

@ExternalDomain
public class PartOfInvoiceConverter implements DomainConverter<PartOfInvoice, String> {

	@Override
	public String fromDomainToValue(PartOfInvoice domain) {
		return domain.getNativeValue();
	}

	@Override
	public PartOfInvoice fromValueToDomain(String value) {
		return new PART_OF_INVOICE(value);
	}

}
