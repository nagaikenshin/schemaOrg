package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PROCEDURE_TYPE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ProcedureType;

@ExternalDomain
public class ProcedureTypeConverter implements DomainConverter<ProcedureType, String> {

	@Override
	public String fromDomainToValue(ProcedureType domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProcedureType fromValueToDomain(String value) {
		return new PROCEDURE_TYPE(value);
	}

}
