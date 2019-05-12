package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.GUIDELINE_SUBJECT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.GuidelineSubject;

@ExternalDomain
public class GuidelineSubjectConverter implements DomainConverter<GuidelineSubject, String> {

	@Override
	public String fromDomainToValue(GuidelineSubject domain) {
		return domain.getNativeValue();
	}

	@Override
	public GuidelineSubject fromValueToDomain(String value) {
		return new GUIDELINE_SUBJECT(value);
	}

}