package org.kyojo.schemaOrg.m3n3.doma.core.actionStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.actionStatusType.ACTIVE_ACTION_STATUS;
import org.kyojo.schemaOrg.m3n3.core.ActionStatusType.ActiveActionStatus;

@ExternalDomain
public class ActiveActionStatusConverter implements DomainConverter<ActiveActionStatus, String> {

	@Override
	public String fromDomainToValue(ActiveActionStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActiveActionStatus fromValueToDomain(String value) {
		return new ACTIVE_ACTION_STATUS(value);
	}

}
