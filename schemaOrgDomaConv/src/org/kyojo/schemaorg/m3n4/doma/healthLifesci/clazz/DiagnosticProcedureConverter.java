package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DIAGNOSTIC_PROCEDURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DiagnosticProcedure;

@ExternalDomain
public class DiagnosticProcedureConverter implements DomainConverter<DiagnosticProcedure, String> {

	@Override
	public String fromDomainToValue(DiagnosticProcedure domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiagnosticProcedure fromValueToDomain(String value) {
		return new DIAGNOSTIC_PROCEDURE(value);
	}

}
