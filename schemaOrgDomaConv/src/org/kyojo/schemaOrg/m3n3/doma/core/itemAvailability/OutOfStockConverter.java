package org.kyojo.schemaOrg.m3n3.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.itemAvailability.OUT_OF_STOCK;
import org.kyojo.schemaOrg.m3n3.core.ItemAvailability.OutOfStock;

@ExternalDomain
public class OutOfStockConverter implements DomainConverter<OutOfStock, String> {

	@Override
	public String fromDomainToValue(OutOfStock domain) {
		return domain.getNativeValue();
	}

	@Override
	public OutOfStock fromValueToDomain(String value) {
		return new OUT_OF_STOCK(value);
	}

}
