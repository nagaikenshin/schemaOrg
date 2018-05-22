package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCEPTED_ANSWER;
import org.kyojo.schemaOrg.m3n3.core.Container.AcceptedAnswer;

@ExternalDomain
public class AcceptedAnswerConverter implements DomainConverter<AcceptedAnswer, String> {

	@Override
	public String fromDomainToValue(AcceptedAnswer domain) {
		return domain.getNativeValue();
	}

	@Override
	public AcceptedAnswer fromValueToDomain(String value) {
		return new ACCEPTED_ANSWER(value);
	}

}
