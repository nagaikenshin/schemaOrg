package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STUDY_DESIGN;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.StudyDesign;

@ExternalDomain
public class StudyDesignConverter implements DomainConverter<StudyDesign, String> {

	@Override
	public String fromDomainToValue(StudyDesign domain) {
		return domain.getNativeValue();
	}

	@Override
	public StudyDesign fromValueToDomain(String value) {
		return new STUDY_DESIGN(value);
	}

}
