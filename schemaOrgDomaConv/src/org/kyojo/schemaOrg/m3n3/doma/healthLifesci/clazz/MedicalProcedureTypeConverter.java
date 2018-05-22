package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_PROCEDURE_TYPE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalProcedureType;

@ExternalDomain
public class MedicalProcedureTypeConverter implements DomainConverter<MedicalProcedureType, String> {

	@Override
	public String fromDomainToValue(MedicalProcedureType domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalProcedureType fromValueToDomain(String value) {
		return new MEDICAL_PROCEDURE_TYPE(value);
	}

}
