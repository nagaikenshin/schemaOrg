package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.QUESTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.Question;

@ExternalDomain
public class QuestionConverter implements DomainConverter<Question, String> {

	@Override
	public String fromDomainToValue(Question domain) {
		return domain.getNativeValue();
	}

	@Override
	public Question fromValueToDomain(String value) {
		return new QUESTION(value);
	}

}
