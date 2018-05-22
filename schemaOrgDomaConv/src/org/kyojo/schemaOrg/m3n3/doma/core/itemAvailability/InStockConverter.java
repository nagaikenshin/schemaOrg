package org.kyojo.schemaOrg.m3n3.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.itemAvailability.IN_STOCK;
import org.kyojo.schemaOrg.m3n3.core.ItemAvailability.InStock;

@ExternalDomain
public class InStockConverter implements DomainConverter<InStock, String> {

	@Override
	public String fromDomainToValue(InStock domain) {
		return domain.getNativeValue();
	}

	@Override
	public InStock fromValueToDomain(String value) {
		return new IN_STOCK(value);
	}

}
