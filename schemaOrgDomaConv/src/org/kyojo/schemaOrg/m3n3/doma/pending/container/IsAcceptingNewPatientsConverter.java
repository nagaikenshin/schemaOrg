package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.IS_ACCEPTING_NEW_PATIENTS;
import org.kyojo.schemaOrg.m3n3.pending.Container.IsAcceptingNewPatients;

@ExternalDomain
public class IsAcceptingNewPatientsConverter implements DomainConverter<IsAcceptingNewPatients, Boolean> {

	@Override
	public Boolean fromDomainToValue(IsAcceptingNewPatients domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsAcceptingNewPatients fromValueToDomain(Boolean value) {
		return new IS_ACCEPTING_NEW_PATIENTS(value);
	}

}
