package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalExam.MUSCULOSKELETAL_EXAM;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalExam.MusculoskeletalExam;

@ExternalDomain
public class MusculoskeletalExamConverter implements DomainConverter<MusculoskeletalExam, String> {

	@Override
	public String fromDomainToValue(MusculoskeletalExam domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusculoskeletalExam fromValueToDomain(String value) {
		return new MUSCULOSKELETAL_EXAM(value);
	}

}
