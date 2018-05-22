package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ANSWER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Answer;

@ExternalDomain
public class AnswerConverter implements DomainConverter<Answer, String> {

	@Override
	public String fromDomainToValue(Answer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Answer fromValueToDomain(String value) {
		return new ANSWER(value);
	}

}
