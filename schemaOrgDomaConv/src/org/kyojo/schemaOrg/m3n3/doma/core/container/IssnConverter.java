package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ISSN;
import org.kyojo.schemaOrg.m3n3.core.Container.Issn;

@ExternalDomain
public class IssnConverter implements DomainConverter<Issn, String> {

	@Override
	public String fromDomainToValue(Issn domain) {
		return domain.getNativeValue();
	}

	@Override
	public Issn fromValueToDomain(String value) {
		return new ISSN(value);
	}

}
