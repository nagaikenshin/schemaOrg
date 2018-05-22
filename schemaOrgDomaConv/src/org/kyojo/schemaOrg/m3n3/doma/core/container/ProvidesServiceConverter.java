package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROVIDES_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Container.ProvidesService;

@ExternalDomain
public class ProvidesServiceConverter implements DomainConverter<ProvidesService, String> {

	@Override
	public String fromDomainToValue(ProvidesService domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProvidesService fromValueToDomain(String value) {
		return new PROVIDES_SERVICE(value);
	}

}
