package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OWNED_FROM;
import org.kyojo.schemaOrg.m3n3.core.Container.OwnedFrom;

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
