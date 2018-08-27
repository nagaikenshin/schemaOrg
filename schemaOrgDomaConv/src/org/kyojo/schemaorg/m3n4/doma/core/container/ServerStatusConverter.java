package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SERVER_STATUS;
import org.kyojo.schemaorg.m3n4.core.Container.ServerStatus;

@ExternalDomain
public class ServerStatusConverter implements DomainConverter<ServerStatus, String> {

	@Override
	public String fromDomainToValue(ServerStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServerStatus fromValueToDomain(String value) {
		return new SERVER_STATUS(value);
	}

}