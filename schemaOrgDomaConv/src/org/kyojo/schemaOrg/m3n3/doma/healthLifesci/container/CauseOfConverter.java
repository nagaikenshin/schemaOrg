package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.CAUSE_OF;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CauseOf;

@ExternalDomain
public class CauseOfConverter implements DomainConverter<CauseOf, String> {

	@Override
	public String fromDomainToValue(CauseOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public CauseOf fromValueToDomain(String value) {
		return new CAUSE_OF(value);
	}

}
