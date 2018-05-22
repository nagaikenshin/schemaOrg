package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.CAUSE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Cause;

@ExternalDomain
public class CauseConverter implements DomainConverter<Cause, String> {

	@Override
	public String fromDomainToValue(Cause domain) {
		return domain.getNativeValue();
	}

	@Override
	public Cause fromValueToDomain(String value) {
		return new CAUSE(value);
	}

}
