package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalStudyStatus.WITHDRAWN;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalStudyStatus.Withdrawn;

@ExternalDomain
public class WithdrawnConverter implements DomainConverter<Withdrawn, String> {

	@Override
	public String fromDomainToValue(Withdrawn domain) {
		return domain.getNativeValue();
	}

	@Override
	public Withdrawn fromValueToDomain(String value) {
		return new WITHDRAWN(value);
	}

}
