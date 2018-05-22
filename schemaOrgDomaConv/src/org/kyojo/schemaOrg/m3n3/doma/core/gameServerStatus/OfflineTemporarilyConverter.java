package org.kyojo.schemaOrg.m3n3.doma.core.gameServerStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.gameServerStatus.OFFLINE_TEMPORARILY;
import org.kyojo.schemaOrg.m3n3.core.GameServerStatus.OfflineTemporarily;

@ExternalDomain
public class OfflineTemporarilyConverter implements DomainConverter<OfflineTemporarily, String> {

	@Override
	public String fromDomainToValue(OfflineTemporarily domain) {
		return domain.getNativeValue();
	}

	@Override
	public OfflineTemporarily fromValueToDomain(String value) {
		return new OFFLINE_TEMPORARILY(value);
	}

}
