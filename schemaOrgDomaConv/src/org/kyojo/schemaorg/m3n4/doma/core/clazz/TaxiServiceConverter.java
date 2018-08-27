package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TAXI_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Clazz.TaxiService;

@ExternalDomain
public class TaxiServiceConverter implements DomainConverter<TaxiService, String> {

	@Override
	public String fromDomainToValue(TaxiService domain) {
		return domain.getNativeValue();
	}

	@Override
	public TaxiService fromValueToDomain(String value) {
		return new TAXI_SERVICE(value);
	}

}
