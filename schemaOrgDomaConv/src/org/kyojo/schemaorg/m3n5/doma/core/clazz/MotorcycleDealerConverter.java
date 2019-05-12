package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MOTORCYCLE_DEALER;
import org.kyojo.schemaorg.m3n5.core.Clazz.MotorcycleDealer;

@ExternalDomain
public class MotorcycleDealerConverter implements DomainConverter<MotorcycleDealer, String> {

	@Override
	public String fromDomainToValue(MotorcycleDealer domain) {
		return domain.getNativeValue();
	}

	@Override
	public MotorcycleDealer fromValueToDomain(String value) {
		return new MOTORCYCLE_DEALER(value);
	}

}
