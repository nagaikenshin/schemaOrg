package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.MASTHEAD;
import org.kyojo.schemaOrg.m3n3.pending.Container.Masthead;

@ExternalDomain
public class MastheadConverter implements DomainConverter<Masthead, String> {

	@Override
	public String fromDomainToValue(Masthead domain) {
		return domain.getNativeValue();
	}

	@Override
	public Masthead fromValueToDomain(String value) {
		return new MASTHEAD(value);
	}

}
