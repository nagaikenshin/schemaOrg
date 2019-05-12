package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalStudyStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalStudyStatus.COMPLETED;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalStudyStatus.Completed;

@ExternalDomain
public class CompletedConverter implements DomainConverter<Completed, String> {

	@Override
	public String fromDomainToValue(Completed domain) {
		return domain.getNativeValue();
	}

	@Override
	public Completed fromValueToDomain(String value) {
		return new COMPLETED(value);
	}

}
