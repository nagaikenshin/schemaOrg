package org.kyojo.schemaOrg.m3n3.doma.core.gameServerStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.gameServerStatus.OFFLINE_PERMANENTLY;
import org.kyojo.schemaOrg.m3n3.core.GameServerStatus.OfflinePermanently;

@ExternalDomain
public class OfflinePermanentlyConverter implements DomainConverter<OfflinePermanently, String> {

	@Override
	public String fromDomainToValue(OfflinePermanently domain) {
		return domain.getNativeValue();
	}

	@Override
	public OfflinePermanently fromValueToDomain(String value) {
		return new OFFLINE_PERMANENTLY(value);
	}

}
