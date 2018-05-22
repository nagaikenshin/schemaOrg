package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalStudyStatus.SUSPENDED;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalStudyStatus.Suspended;

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
