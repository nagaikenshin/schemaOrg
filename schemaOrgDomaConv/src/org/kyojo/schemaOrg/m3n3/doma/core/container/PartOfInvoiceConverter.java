package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PART_OF_INVOICE;
import org.kyojo.schemaOrg.m3n3.core.Container.PartOfInvoice;

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
