package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.STUDY_DESIGN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StudyDesign;

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
