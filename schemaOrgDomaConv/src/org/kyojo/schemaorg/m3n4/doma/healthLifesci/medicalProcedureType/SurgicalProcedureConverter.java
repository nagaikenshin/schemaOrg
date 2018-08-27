package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalProcedureType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalProcedureType.SURGICAL_PROCEDURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalProcedureType.SurgicalProcedure;

@ExternalDomain
public class SurgicalProcedureConverter implements DomainConverter<SurgicalProcedure, String> {

	@Override
	public String fromDomainToValue(SurgicalProcedure domain) {
		return domain.getNativeValue();
	}

	@Override
	public SurgicalProcedure fromValueToDomain(String value) {
		return new SURGICAL_PROCEDURE(value);
	}

}
