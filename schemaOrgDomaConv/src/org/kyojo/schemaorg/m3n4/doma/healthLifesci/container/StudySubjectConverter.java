package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STUDY_SUBJECT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.StudySubject;

@ExternalDomain
public class StudySubjectConverter implements DomainConverter<StudySubject, String> {

	@Override
	public String fromDomainToValue(StudySubject domain) {
		return domain.getNativeValue();
	}

	@Override
	public StudySubject fromValueToDomain(String value) {
		return new STUDY_SUBJECT(value);
	}

}
