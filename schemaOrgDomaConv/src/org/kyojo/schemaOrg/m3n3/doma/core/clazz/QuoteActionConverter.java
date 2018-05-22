package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.QUOTE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.QuoteAction;

@ExternalDomain
public class QuoteActionConverter implements DomainConverter<QuoteAction, String> {

	@Override
	public String fromDomainToValue(QuoteAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public QuoteAction fromValueToDomain(String value) {
		return new QUOTE_ACTION(value);
	}

}
