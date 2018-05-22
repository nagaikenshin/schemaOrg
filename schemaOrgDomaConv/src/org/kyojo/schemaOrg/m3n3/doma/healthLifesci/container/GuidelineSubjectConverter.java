package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.GUIDELINE_SUBJECT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.GuidelineSubject;

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
