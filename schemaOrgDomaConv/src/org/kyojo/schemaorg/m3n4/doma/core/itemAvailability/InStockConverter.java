package org.kyojo.schemaorg.m3n4.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.itemAvailability.IN_STOCK;
import org.kyojo.schemaorg.m3n4.core.ItemAvailability.InStock;

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
