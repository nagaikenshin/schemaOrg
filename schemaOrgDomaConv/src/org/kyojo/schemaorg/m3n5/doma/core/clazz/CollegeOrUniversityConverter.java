package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COLLEGE_OR_UNIVERSITY;
import org.kyojo.schemaorg.m3n5.core.Clazz.CollegeOrUniversity;

@ExternalDomain
public class CollegeOrUniversityConverter implements DomainConverter<CollegeOrUniversity, String> {

	@Override
	public String fromDomainToValue(CollegeOrUniversity domain) {
		return domain.getNativeValue();
	}

	@Override
	public CollegeOrUniversity fromValueToDomain(String value) {
		return new COLLEGE_OR_UNIVERSITY(value);
	}

}
