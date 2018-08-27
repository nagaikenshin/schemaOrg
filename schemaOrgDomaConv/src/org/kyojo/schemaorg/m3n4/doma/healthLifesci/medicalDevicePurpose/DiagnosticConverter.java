package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalDevicePurpose;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalDevicePurpose.DIAGNOSTIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalDevicePurpose.Diagnostic;

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
