package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUTO_RENTAL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AutoRental;

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
