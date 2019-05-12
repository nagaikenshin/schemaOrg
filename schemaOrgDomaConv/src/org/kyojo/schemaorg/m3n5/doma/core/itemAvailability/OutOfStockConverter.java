package org.kyojo.schemaorg.m3n5.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.itemAvailability.OUT_OF_STOCK;
import org.kyojo.schemaorg.m3n5.core.ItemAvailability.OutOfStock;

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
