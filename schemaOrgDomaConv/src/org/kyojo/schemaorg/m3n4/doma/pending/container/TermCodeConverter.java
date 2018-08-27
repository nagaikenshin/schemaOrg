package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.TERM_CODE;
import org.kyojo.schemaorg.m3n4.pending.Container.TermCode;

@ExternalDomain
public class TermCodeConverter implements DomainConverter<TermCode, String> {

	@Override
	public String fromDomainToValue(TermCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public TermCode fromValueToDomain(String value) {
		return new TERM_CODE(value);
	}

}
