package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalStudyStatus.SUSPENDED;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalStudyStatus.Suspended;

@ExternalDomain
public class SuspendedConverter implements DomainConverter<Suspended, String> {

	@Override
	public String fromDomainToValue(Suspended domain) {
		return domain.getNativeValue();
	}

	@Override
	public Suspended fromValueToDomain(String value) {
		return new SUSPENDED(value);
	}

}
