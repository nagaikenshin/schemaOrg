package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalProcedureType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalProcedureType.PERCUTANEOUS_PROCEDURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalProcedureType.PercutaneousProcedure;

@ExternalDomain
public class PercutaneousProcedureConverter implements DomainConverter<PercutaneousProcedure, String> {

	@Override
	public String fromDomainToValue(PercutaneousProcedure domain) {
		return domain.getNativeValue();
	}

	@Override
	public PercutaneousProcedure fromValueToDomain(String value) {
		return new PERCUTANEOUS_PROCEDURE(value);
	}

}
