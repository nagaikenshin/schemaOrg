package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.STATUS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Status;

@ExternalDomain
public class StatusConverter implements DomainConverter<Status, String> {

	@Override
	public String fromDomainToValue(Status domain) {
		return domain.getNativeValue();
	}

	@Override
	public Status fromValueToDomain(String value) {
		return new STATUS(value);
	}

}