package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.IS_ACCEPTING_NEW_PATIENTS;
import org.kyojo.schemaorg.m3n4.pending.Container.IsAcceptingNewPatients;

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
