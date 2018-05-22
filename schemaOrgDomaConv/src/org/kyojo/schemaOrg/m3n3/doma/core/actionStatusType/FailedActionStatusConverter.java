package org.kyojo.schemaOrg.m3n3.doma.core.actionStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.actionStatusType.FAILED_ACTION_STATUS;
import org.kyojo.schemaOrg.m3n3.core.ActionStatusType.FailedActionStatus;

@ExternalDomain
public class FailedActionStatusConverter implements DomainConverter<FailedActionStatus, String> {

	@Override
	public String fromDomainToValue(FailedActionStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public FailedActionStatus fromValueToDomain(String value) {
		return new FAILED_ACTION_STATUS(value);
	}

}
