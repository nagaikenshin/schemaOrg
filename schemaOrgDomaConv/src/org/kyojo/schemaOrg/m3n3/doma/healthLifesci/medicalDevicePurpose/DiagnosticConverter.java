package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalDevicePurpose;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalDevicePurpose.DIAGNOSTIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalDevicePurpose.Diagnostic;

@ExternalDomain
public class DiagnosticConverter implements DomainConverter<Diagnostic, String> {

	@Override
	public String fromDomainToValue(Diagnostic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Diagnostic fromValueToDomain(String value) {
		return new DIAGNOSTIC(value);
	}

}
