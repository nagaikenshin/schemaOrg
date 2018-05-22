package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERVER_STATUS;
import org.kyojo.schemaOrg.m3n3.core.Container.ServerStatus;

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
