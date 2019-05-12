package org.kyojo.schemaorg.m3n5.doma.core.gameServerStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.gameServerStatus.ONLINE;
import org.kyojo.schemaorg.m3n5.core.GameServerStatus.Online;

@ExternalDomain
public class OnlineConverter implements DomainConverter<Online, String> {

	@Override
	public String fromDomainToValue(Online domain) {
		return domain.getNativeValue();
	}

	@Override
	public Online fromValueToDomain(String value) {
		return new ONLINE(value);
	}

}
