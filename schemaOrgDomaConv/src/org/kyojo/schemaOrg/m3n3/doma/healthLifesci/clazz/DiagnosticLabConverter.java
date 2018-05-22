package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DIAGNOSTIC_LAB;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.DiagnosticLab;

@ExternalDomain
public class DiagnosticLabConverter implements DomainConverter<DiagnosticLab, String> {

	@Override
	public String fromDomainToValue(DiagnosticLab domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiagnosticLab fromValueToDomain(String value) {
		return new DIAGNOSTIC_LAB(value);
	}

}
