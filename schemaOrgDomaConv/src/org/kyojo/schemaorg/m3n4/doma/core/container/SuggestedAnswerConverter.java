package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SUGGESTED_ANSWER;
import org.kyojo.schemaorg.m3n4.core.Container.SuggestedAnswer;

@ExternalDomain
public class SuggestedAnswerConverter implements DomainConverter<SuggestedAnswer, String> {

	@Override
	public String fromDomainToValue(SuggestedAnswer domain) {
		return domain.getNativeValue();
	}

	@Override
	public SuggestedAnswer fromValueToDomain(String value) {
		return new SUGGESTED_ANSWER(value);
	}

}
