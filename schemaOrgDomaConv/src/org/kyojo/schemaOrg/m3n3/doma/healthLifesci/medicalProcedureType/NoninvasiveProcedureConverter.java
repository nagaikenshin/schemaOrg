package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalProcedureType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalProcedureType.NONINVASIVE_PROCEDURE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalProcedureType.NoninvasiveProcedure;

@ExternalDomain
public class NoninvasiveProcedureConverter implements DomainConverter<NoninvasiveProcedure, String> {

	@Override
	public String fromDomainToValue(NoninvasiveProcedure domain) {
		return domain.getNativeValue();
	}

	@Override
	public NoninvasiveProcedure fromValueToDomain(String value) {
		return new NONINVASIVE_PROCEDURE(value);
	}

}
