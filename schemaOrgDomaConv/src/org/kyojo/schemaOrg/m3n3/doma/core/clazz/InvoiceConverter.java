package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INVOICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Invoice;

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
