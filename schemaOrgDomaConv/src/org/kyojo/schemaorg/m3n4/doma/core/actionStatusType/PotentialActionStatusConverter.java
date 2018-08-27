package org.kyojo.schemaorg.m3n4.doma.core.actionStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.actionStatusType.POTENTIAL_ACTION_STATUS;
import org.kyojo.schemaorg.m3n4.core.ActionStatusType.PotentialActionStatus;

@ExternalDomain
public class PotentialActionStatusConverter implements DomainConverter<PotentialActionStatus, String> {

	@Override
	public String fromDomainToValue(PotentialActionStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public PotentialActionStatus fromValueToDomain(String value) {
		return new POTENTIAL_ACTION_STATUS(value);
	}

}