package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SALE_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SaleEvent;

@ExternalDomain
public class SaleEventConverter implements DomainConverter<SaleEvent, String> {

	@Override
	public String fromDomainToValue(SaleEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public SaleEvent fromValueToDomain(String value) {
		return new SALE_EVENT(value);
	}

}
