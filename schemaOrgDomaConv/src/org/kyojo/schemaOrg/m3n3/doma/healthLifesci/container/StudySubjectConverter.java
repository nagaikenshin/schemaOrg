package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.STUDY_SUBJECT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StudySubject;

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
