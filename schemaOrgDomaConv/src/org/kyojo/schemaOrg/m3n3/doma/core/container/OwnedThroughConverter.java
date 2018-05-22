package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OWNED_THROUGH;
import org.kyojo.schemaOrg.m3n3.core.Container.OwnedThrough;

@ExternalDomain
public class OwnedThroughConverter implements DomainConverter<OwnedThrough, Date> {

	@Override
	public Date fromDomainToValue(OwnedThrough domain) {
		return domain.getNativeValue();
	}

	@Override
	public OwnedThrough fromValueToDomain(Date value) {
		return new OWNED_THROUGH(value);
	}

}
