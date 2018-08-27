package org.kyojo.schemaorg.m3n4.doma.core.gameServerStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.gameServerStatus.OFFLINE_PERMANENTLY;
import org.kyojo.schemaorg.m3n4.core.GameServerStatus.OfflinePermanently;

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
