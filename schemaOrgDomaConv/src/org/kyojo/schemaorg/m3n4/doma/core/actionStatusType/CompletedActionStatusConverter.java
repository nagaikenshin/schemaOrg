package org.kyojo.schemaorg.m3n4.doma.core.actionStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.actionStatusType.COMPLETED_ACTION_STATUS;
import org.kyojo.schemaorg.m3n4.core.ActionStatusType.CompletedActionStatus;

@ExternalDomain
public class CompletedActionStatusConverter implements DomainConverter<CompletedActionStatus, String> {

	@Override
	public String fromDomainToValue(CompletedActionStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public CompletedActionStatus fromValueToDomain(String value) {
		return new COMPLETED_ACTION_STATUS(value);
	}

}