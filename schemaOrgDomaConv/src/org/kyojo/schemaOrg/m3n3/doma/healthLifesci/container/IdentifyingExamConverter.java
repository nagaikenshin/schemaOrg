package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.IDENTIFYING_EXAM;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IdentifyingExam;

@ExternalDomain
public class IdentifyingExamConverter implements DomainConverter<IdentifyingExam, String> {

	@Override
	public String fromDomainToValue(IdentifyingExam domain) {
		return domain.getNativeValue();
	}

	@Override
	public IdentifyingExam fromValueToDomain(String value) {
		return new IDENTIFYING_EXAM(value);
	}

}
