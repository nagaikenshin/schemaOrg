package org.kyojo.schemaorg.m3n5.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.itemAvailability.SOLD_OUT;
import org.kyojo.schemaorg.m3n5.core.ItemAvailability.SoldOut;

@ExternalDomain
public class SoldOutConverter implements DomainConverter<SoldOut, String> {

	@Override
	public String fromDomainToValue(SoldOut domain) {
		return domain.getNativeValue();
	}

	@Override
	public SoldOut fromValueToDomain(String value) {
		return new SOLD_OUT(value);
	}

}
