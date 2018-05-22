package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.QUESTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Question;

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
