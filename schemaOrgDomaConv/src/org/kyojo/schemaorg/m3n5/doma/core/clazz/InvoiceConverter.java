package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INVOICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Invoice;

@ExternalDomain
public class InvoiceConverter implements DomainConverter<Invoice, String> {

	@Override
	public String fromDomainToValue(Invoice domain) {
		return domain.getNativeValue();
	}

	@Override
	public Invoice fromValueToDomain(String value) {
		return new INVOICE(value);
	}

}
