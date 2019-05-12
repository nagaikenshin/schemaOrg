package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.OWNED_FROM;
import org.kyojo.schemaorg.m3n5.core.Container.OwnedFrom;

@ExternalDomain
public class OwnedFromConverter implements DomainConverter<OwnedFrom, Date> {

	@Override
	public Date fromDomainToValue(OwnedFrom domain) {
		return domain.getNativeValue();
	}

	@Override
	public OwnedFrom fromValueToDomain(Date value) {
		return new OWNED_FROM(value);
	}

}
