package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalProcedureType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalProcedureType.NONINVASIVE_PROCEDURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalProcedureType.NoninvasiveProcedure;

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
