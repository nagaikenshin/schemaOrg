package org.kyojo.schemaorg.m3n5.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.physicalExam.MUSCULOSKELETAL_EXAM;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalExam.MusculoskeletalExam;

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
