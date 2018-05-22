package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERVES_CUISINE;
import org.kyojo.schemaOrg.m3n3.core.Container.ServesCuisine;

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
