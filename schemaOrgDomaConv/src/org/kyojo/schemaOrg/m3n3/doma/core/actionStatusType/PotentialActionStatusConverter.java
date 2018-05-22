package org.kyojo.schemaOrg.m3n3.doma.core.actionStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.actionStatusType.POTENTIAL_ACTION_STATUS;
import org.kyojo.schemaOrg.m3n3.core.ActionStatusType.PotentialActionStatus;

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
