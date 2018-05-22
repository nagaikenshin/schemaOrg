package org.kyojo.schemaOrg.m3n3.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.itemAvailability.PRE_SALE;
import org.kyojo.schemaOrg.m3n3.core.ItemAvailability.PreSale;

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
