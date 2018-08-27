package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EDUCATION_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationEvent;

@ExternalDomain
public class EducationEventConverter implements DomainConverter<EducationEvent, String> {

	@Override
	public String fromDomainToValue(EducationEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationEvent fromValueToDomain(String value) {
		return new EDUCATION_EVENT(value);
	}

}
