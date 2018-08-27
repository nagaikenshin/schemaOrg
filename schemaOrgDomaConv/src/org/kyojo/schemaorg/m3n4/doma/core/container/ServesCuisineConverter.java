package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SERVES_CUISINE;
import org.kyojo.schemaorg.m3n4.core.Container.ServesCuisine;

@ExternalDomain
public class ServesCuisineConverter implements DomainConverter<ServesCuisine, String> {

	@Override
	public String fromDomainToValue(ServesCuisine domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServesCuisine fromValueToDomain(String value) {
		return new SERVES_CUISINE(value);
	}

}
