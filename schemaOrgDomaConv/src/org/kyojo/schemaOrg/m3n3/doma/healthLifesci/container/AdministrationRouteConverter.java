package org.kyojo.schemaorg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.healthLifesci.impl.ADMINISTRATION_ROUTE;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.AdministrationRoute;

@ExternalDomain
public class AdministrationRouteConverter implements DomainConverter<AdministrationRoute, String> {

	@Override
	public String fromDomainToValue(AdministrationRoute domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdministrationRoute fromValueToDomain(String value) {
		return new ADMINISTRATION_ROUTE(value);
	}

}
