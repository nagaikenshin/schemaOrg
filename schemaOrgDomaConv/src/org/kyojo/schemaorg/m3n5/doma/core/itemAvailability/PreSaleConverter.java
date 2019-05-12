package org.kyojo.schemaorg.m3n5.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.itemAvailability.PRE_SALE;
import org.kyojo.schemaorg.m3n5.core.ItemAvailability.PreSale;

@ExternalDomain
public class PreSaleConverter implements DomainConverter<PreSale, String> {

	@Override
	public String fromDomainToValue(PreSale domain) {
		return domain.getNativeValue();
	}

	@Override
	public PreSale fromValueToDomain(String value) {
		return new PRE_SALE(value);
	}

}