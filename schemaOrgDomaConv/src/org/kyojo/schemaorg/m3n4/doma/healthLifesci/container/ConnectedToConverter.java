package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.CONNECTED_TO;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ConnectedTo;

@ExternalDomain
public class ConnectedToConverter implements DomainConverter<ConnectedTo, String> {

	@Override
	public String fromDomainToValue(ConnectedTo domain) {
		return domain.getNativeValue();
	}

	@Override
	public ConnectedTo fromValueToDomain(String value) {
		return new CONNECTED_TO(value);
	}

}