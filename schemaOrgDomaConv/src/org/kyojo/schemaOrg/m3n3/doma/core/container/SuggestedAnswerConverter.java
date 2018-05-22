package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUGGESTED_ANSWER;
import org.kyojo.schemaOrg.m3n3.core.Container.SuggestedAnswer;

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
