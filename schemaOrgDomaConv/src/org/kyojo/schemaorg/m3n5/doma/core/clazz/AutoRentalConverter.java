package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AUTO_RENTAL;
import org.kyojo.schemaorg.m3n5.core.Clazz.AutoRental;

@ExternalDomain
public class AutoRentalConverter implements DomainConverter<AutoRental, String> {

	@Override
	public String fromDomainToValue(AutoRental domain) {
		return domain.getNativeValue();
	}

	@Override
	public AutoRental fromValueToDomain(String value) {
		return new AUTO_RENTAL(value);
	}

}