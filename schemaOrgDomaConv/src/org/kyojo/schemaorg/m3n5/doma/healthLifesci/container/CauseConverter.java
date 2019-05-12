package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.CAUSE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Cause;

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
