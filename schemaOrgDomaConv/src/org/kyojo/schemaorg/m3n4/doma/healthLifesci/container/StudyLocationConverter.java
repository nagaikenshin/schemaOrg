package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STUDY_LOCATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.StudyLocation;

@ExternalDomain
public class StudyLocationConverter implements DomainConverter<StudyLocation, String> {

	@Override
	public String fromDomainToValue(StudyLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public StudyLocation fromValueToDomain(String value) {
		return new STUDY_LOCATION(value);
	}

}
