package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ACCEPTED_ANSWER;
import org.kyojo.schemaorg.m3n4.core.Container.AcceptedAnswer;

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
