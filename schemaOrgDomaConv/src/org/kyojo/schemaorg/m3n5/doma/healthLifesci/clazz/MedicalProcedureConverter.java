package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_PROCEDURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalProcedure;

@ExternalDomain
public class MedicalProcedureConverter implements DomainConverter<MedicalProcedure, String> {

	@Override
	public String fromDomainToValue(MedicalProcedure domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalProcedure fromValueToDomain(String value) {
		return new MEDICAL_PROCEDURE(value);
	}

}
