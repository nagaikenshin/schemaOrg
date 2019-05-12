package org.kyojo.schemaorg.m3n5.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.physicalExam.CARDIOVASCULAR_EXAM;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalExam.CardiovascularExam;

@ExternalDomain
public class CardiovascularExamConverter implements DomainConverter<CardiovascularExam, String> {

	@Override
	public String fromDomainToValue(CardiovascularExam domain) {
		return domain.getNativeValue();
	}

	@Override
	public CardiovascularExam fromValueToDomain(String value) {
		return new CARDIOVASCULAR_EXAM(value);
	}

}
