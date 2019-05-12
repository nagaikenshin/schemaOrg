package org.kyojo.schemaorg.m3n5.doma.core.actionStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.actionStatusType.FAILED_ACTION_STATUS;
import org.kyojo.schemaorg.m3n5.core.ActionStatusType.FailedActionStatus;

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
