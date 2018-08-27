package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalStudyStatus.TERMINATED;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalStudyStatus.Terminated;

@ExternalDomain
public class TerminatedConverter implements DomainConverter<Terminated, String> {

	@Override
	public String fromDomainToValue(Terminated domain) {
		return domain.getNativeValue();
	}

	@Override
	public Terminated fromValueToDomain(String value) {
		return new TERMINATED(value);
	}

}
