package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalProcedureType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalProcedureType.PERCUTANEOUS_PROCEDURE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalProcedureType.PercutaneousProcedure;

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
