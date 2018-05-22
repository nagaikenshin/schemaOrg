package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.QUOTATION;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.Quotation;

@ExternalDomain
public class QuotationConverter implements DomainConverter<Quotation, String> {

	@Override
	public String fromDomainToValue(Quotation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Quotation fromValueToDomain(String value) {
		return new QUOTATION(value);
	}

}
